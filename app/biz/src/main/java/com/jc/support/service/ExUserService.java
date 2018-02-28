package com.jc.support.service;

import com.jc.support.exception.ServiceException;
import com.jc.support.model.ExUserVO;
import com.zeh.jungle.dal.paginator.PageList;

/**
 * supports-parent
 *
 * Created by weijun on 2018/2/27
 *
 */
public interface ExUserService {
    /**
     * 通过用户id查询
     *
     * @param userId    用户id
     * @return
     * @throws ServiceException
     */
    ExUserVO findByUserId(Long userId) throws ServiceException;

    /**
     * 通过对象条件查询
     *
     * @param user      查询条件对象
     * @param pageNum   页数
     * @param pageSize  每页多少条
     * @return
     * @throws ServiceException
     */
    PageList<ExUserVO> queryByConditions(ExUserVO user, int pageNum, int pageSize) throws ServiceException;
}
