package com.ayush;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private boolean isDomesticated;


    public void walk(){

    }

    public void runu(){

    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    private void chew(){
        System.out.println("Dog chew called");
    }

    public Dog(String name, int brain, int body, int weight) {
        super(name, brain, body, weight);
        this.eyes=eyes;
        this.legs=eyes;
        this.isDomesticated=true;
    }
}
