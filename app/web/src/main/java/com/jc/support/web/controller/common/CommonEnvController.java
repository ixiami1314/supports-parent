package com.jc.support.web.controller.common;

import com.jc.support.service.CommonEnvService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * supports-parent
 *
 * Created by weijun on 2018/3/1
 *
 */
@Controller
@RequestMapping ("/common")
public class CommonEnvController {

    @Resource
    private CommonEnvService envService;

    @RequestMapping ("env")
    @ResponseBody
    public String env () {
        return envService.env();
    }

    @RequestMapping ("version")
    @ResponseBody
    public String version () {
        return envService.version();
    }

}
