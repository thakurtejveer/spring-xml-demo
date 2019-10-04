package com.stackroute.domain;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    private Actor actor;
//    public void setActor(Actor actor) {
//        this.actor = actor;
//    }
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void printActor(){
        actor.studentInfo();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware implemented");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware implemented");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware Implemented");
    }
}
