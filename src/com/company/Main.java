package com.company;

public class Main {

    public static void main(String[] args) {

        Type car = new Type("Car");
        Car objectA = new Car(2020,true,new Type("Buss"));
        Camry70 objectB = new Camry70(0,2021,false,car);
        Camry70 objectC = new Camry70(2000,2019,false,car);

        objectC.copyElement(objectB);


        objectA.getInfo();
        objectB.getInfo();
        objectC.getInfo();

        objectC.getInfo(2019);
        objectC.getInfo(2021,false);
    }
}
