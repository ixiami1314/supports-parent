package com.jc.support.web.controller.user;

import com.jc.support.exception.ServiceException;
import com.jc.support.model.ExUserVO;
import com.jc.support.service.ExUserService;
import com.jc.support.web.form.ExUserForm;
import com.zeh.jungle.dal.paginator.PageList;
import com.zeh.jungle.dal.paginator.Paginator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * supports-parent
 *
 * Created by weijun on 2018/2/27
 *
 */
@Controller @RequestMapping("/user") public class ExUserController {

    @Resource private ExUserService exUserService;

    @RequestMapping("list") public String list(Model model) {
        return "user/index";
    }

    @RequestMapping("lists") @ResponseBody public PageList<ExUserVO> lists(ExUserForm form, Paginator paginator) {
        //ExUserVO vo = new ExUserVO();
        //vo.setUserName(form.getUserName);
        try {
            PageList<ExUserVO> users = exUserService.queryByConditions(null, paginator.getCurrentPage(), paginator.getPageSize());
            return users;
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return null;
    }
}
