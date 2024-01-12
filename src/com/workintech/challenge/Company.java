package com.workintech.challenge;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;



    private double updatedGiro(double giro){
        return giro<0? 0:giro;
    }
    public Company(int id,String name,double giro,String[] developerNames){
        this.id=id;
        this.name=name;
        this.updatedGiro(giro);
        this.developerNames=developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.updatedGiro(giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployye(int index,String name){
        if(index<0) {
            System.out.println("İndex değeri sıfırdan küçük olamaz!");
        } else {
            try {
                if (developerNames[index]==null){
                    developerNames[index]=name;
                } else {
                    System.out.println("Bu index doludur!");
                }
            } catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("Geçersiz index:" + index);
            } catch (Exception exception){
                System.out.println("Bir hata oluştu:" + index);
            }
        }

    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
