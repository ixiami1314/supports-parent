package com.jc.support.service.impl;

import com.jc.support.service.CommonEnvService;
import com.zeh.jungle.core.configuration.AppConfiguration;
import com.zeh.jungle.core.configuration.AppConfigurationAware;
import org.springframework.stereotype.Service;

/**
 * supports-parent
 *
 * Created by weijun on 2018/3/1
 *
 */
@Service
public class CommonEnvServiceImpl implements CommonEnvService, AppConfigurationAware {

    private AppConfiguration appConfiguration;

    @Override public void setAppConfiguration(AppConfiguration appConfiguration) {
        this.appConfiguration = appConfiguration;
    }

    @Override public String env() {
        return appConfiguration.getPropertyValue ("jungle-env");
    }

    @Override public String version() {
        return appConfiguration.getPropertyValue ("app.version");
    }
}
