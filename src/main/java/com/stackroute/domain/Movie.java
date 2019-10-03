package com.stackroute.domain;


public class Movie {
    private Actor actor;

    public void setActor(Actor act) {
        this.actor = act;
    }

    public void printActor() {
        System.out.println(actor.getAge());
        System.out.println(actor.getName());
        System.out.println(actor.getGender());
    }
}
