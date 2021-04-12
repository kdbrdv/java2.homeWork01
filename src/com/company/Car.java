package com.company;

public class Car extends Transport{
    private int yearOfIssue;

    public Car(int yearOfIssue,boolean isReels, Type type) {
        super(isReels, type);
        this.yearOfIssue = yearOfIssue;
    }
    final void getInfo(int yearOfIssue){
        System.out.println("Перегруженный метод 1");
    }

    public void getInfo(int yearOfIssue, boolean isReels){
        System.out.println("Перегруженный метод 2");
    }

    public void getInfo(){
        System.out.println("Year of issue: " + yearOfIssue);
        System.out.println("Reels: " + isReels());
        System.out.println("Type: " + getType().getType());

    }



    public int getYearOfIssue() {
        return yearOfIssue;
    }
}
