package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("BeanLifeCycleDemoBean is about to close now");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("properties have been set for BeanLifeCycleDemoBean");
    }
    public void customInit() {
        System.out.println("BeanLifecycleDemoBean bean is initialized");
    }
    public void customDestroy() {
        System.out.println("BeanLifecycleDemoBean is destroyed");

    }
}
