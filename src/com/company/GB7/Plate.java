package com.company.GB7;

public class Plate {
    private int food;
    public Plate (int food){
        this.food = food;
    }

    public boolean decreaseFood (int n){

        boolean decrease = food >= n;
        if (decrease) food -= n;
        return decrease;

    }

    public void info (){
        System.out.println("plate: " + food);
    }

    public void setFood (int n){
        food +=n;
    }
    
}
