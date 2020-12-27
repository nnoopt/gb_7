package com.company.GB7;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(50);
        plate.info();
        Cat [] cats = new Cat[4];
        for (int i = 0; i <cats.length ; i++) {
            cats[i]= new Cat ("cat№"+ (i+1), + i*10+10);
            cats[i].eat(plate);
            cats[i].info();
            plate.info();
        }

        plate.setFood(100);
        plate.info();
    }
    
}
