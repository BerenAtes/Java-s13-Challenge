package com.workintech.challenge;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;


    public Employee(int id,String fullName,String email,String password,String[] healthPlans){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthPlans=healthPlans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthPlans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthPlans = healthplans;
    }



    public void addHealthPlan(int index,String name){
        if(index<0) {
            System.out.println("İndex değeri sıfırdan küçük olamaz!" + index);
        } else {
            try{
                if(healthPlans[index]==null){
                    healthPlans[index]=name;
                } else {
                    System.out.println("Bu index doludur!" + index);
                }
            } catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("Geçersiz index:" + index);
            } catch (Exception exception) {
                System.out.println("Bir hata oluştu:" + exception.getMessage());
            }
        }

    }

@Override
public String toString() {
    return "Employee{" +
            "id=" + id +
            ", fullName='" + fullName + '\'' +
            ", email='" + email + '\'' +
            ", password='" + password + '\'' +
            ", healthplans=" + Arrays.toString(healthPlans) +
            '}';
}
}

