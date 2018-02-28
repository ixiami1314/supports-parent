package com.jc.support.service.impl;

import com.jc.support.error.BizErrorFactory;
import com.jc.support.exception.ServiceException;
import com.jc.support.mapper.ExUserMapper;
import com.jc.support.model.ExUserVO;
import com.jc.support.model.enums.UserSexEnum;
import com.jc.support.service.ExUserService;
import com.jc.support.supports.dal.daointerface.ExUserDAO;
import com.jc.support.supports.dal.dataobject.ExUserDO;
import com.jc.support.supports.dal.operation.exuser.QueryByConditionsQuery;
import com.zeh.jungle.dal.paginator.PageList;
import com.zeh.jungle.dal.paginator.PageUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * supports-parent
 *
 * Created by weijun on 2018/2/27
 *
 */
@Service public class ExUserServiceImpl implements ExUserService {

    private static Logger logger = LoggerFactory.getLogger(ExUserServiceImpl.class);

    private static final BizErrorFactory ERROR_FACTORY = BizErrorFactory.getInstance();

    @Resource private ExUserDAO exUserDAO;

    @Resource private ExUserMapper mapper;

    /**
     *
     * @param userId    用户id
     * @return
     * @throws ServiceException
     */
    @Override public ExUserVO findByUserId(Long userId) throws ServiceException {
        if (userId == null)
            throw new ServiceException(ERROR_FACTORY.queryUserIdError());

        ExUserDO user = exUserDAO.queryById(userId);
        if (user == null)
            throw new ServiceException(ERROR_FACTORY.queryUserNotExsitError());

        return mapper.do2vo(user);
    }

    /**
     *
     * @param user      查询条件对象
     * @param pageNum   页数
     * @param pageSize  每页多少条
     * @return
     * @throws ServiceException
     */
    @Override public PageList<ExUserVO> queryByConditions(ExUserVO user, int pageNum, int pageSize) throws ServiceException {
        QueryByConditionsQuery query = new QueryByConditionsQuery();
        if (user != null) {
            query.setUserName(user.getUserName());
            // query.setUserSex(user.getSex() == null ? null : user.getSex().getCode());
        }
        query.setPage(pageNum);
        query.setPageSize(pageSize);
        PageList<ExUserDO> ret = exUserDAO.queryByConditions(query);
        Collection<ExUserVO> commodities = mapper.do2vos(ret.getData());
        return PageUtils.createPageList(commodities, ret.getPaginator());
    }
}
