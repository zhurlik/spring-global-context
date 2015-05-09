package com.zhurlik;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * This class allows having a single instance of Spring Context and simple way to get a reference to itself.
 *
 * @author zhurlik@gmail.com
 */
public class GlobalSpringContext implements ApplicationContextAware, FactoryBean<ApplicationContext> {
    private static ApplicationContext context;

    /**
     * Provides a reference to itself.
     *
     * @param applicationContext Spring context
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    /**
     * To be able to specify as a bean.
     *
     * @return Global Spring Context
     * @throws Exception
     */
    @Override
    public ApplicationContext getObject() throws Exception {
        return context;
    }

    @Override
    public Class<?> getObjectType() {
        return ApplicationContext.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
