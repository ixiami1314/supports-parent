package com.jc.support.error;

import com.zeh.jungle.core.error.AbstractErrorFactory;
import com.zeh.jungle.core.error.JGError;

/**
 * supports-parent
 *
 * Created by weijun on 2018/2/27
 *
 */
public class BizErrorFactory extends AbstractErrorFactory {

    @Override protected String provideErrorBundleName() {
        return "support-biz";
    }

    /**
     * 获取JpaDalErrorFactory单例
     *
     * @return BizErrorFactory
     */
    public static BizErrorFactory getInstance() {
        return BizErrorFactoryHolder.FACTORY;
    }

    /**
     * BizErrorFactoryHolder instance keeper
     *
     * @author allen
     * @version $Id: BizErrorFactoryHolder.java, v 0.1 2016年2月26日 下午4:20:31 allen Exp $
     */
    private static final class BizErrorFactoryHolder {
        /** instance */
        private static final BizErrorFactory FACTORY = new BizErrorFactory();
    }

    public JGError queryUserIdError () {
        return createError ("JG0510001001");
    }

    public JGError queryUserNameError () {
        return createError ("JG0510001002");
    }

    public JGError queryUserNotExsitError () {
        return createError ("JG0510001003");
    }

    public JGError queryUserObjNullError () {
        return createError ("JG0510001004");
    }
}
