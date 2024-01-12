package com.workintech.challenge;

public enum Plan {

    BASIC("Basic",100),
    MEDIUM("Medium",500),
    ADVANCE("Advance",1000);
    private String name;
    private int price;

    Plan(String name,int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Plan(" +
                "name='" + name + '\'' +
                ", price=" + price +
                ')';
    }
}
