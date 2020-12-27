package com.company.GB7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;


    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    public void eat (Plate p){
        satiety = (p.decreaseFood(appetite));

    }

    public void info (){
            System.out.println("name: " + name + " appetite: " + appetite + " satiety: " + satiety);
    }
}
