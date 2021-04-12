package com.company;

public final class Camry70 extends Car{
    private int probeg;

    public Camry70(int probeg,int yearOfIssue, boolean isReels, Type type) {
        super(yearOfIssue, isReels, type);
        this.probeg = probeg;
    }
    public void copyElement(Camry70 camry70){
        this.probeg = camry70.getProbeg();
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Probeg: " + probeg);
    }

    public int getProbeg() {
        return probeg;
    }

}
