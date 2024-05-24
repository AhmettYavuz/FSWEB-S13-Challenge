package org.example;

import java.util.Arrays;

public class Employee {
   private int id;
   private String fullName;
   private String email;
   private String password;
   private String[] healthPlans;


    public Employee(int id,String fullName,  String password, String email, String[] healthPlans) {
        this.id = id;
        this.healthPlans = healthPlans;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
    }


    public int getId() {
        return id;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public void addHealthPlan(int index, String planName) {
        if (index >= 0 && index < healthPlans.length) {
            if (healthPlans[index] == null) {
                healthPlans[index] = planName;
                System.out.println(planName + " sağlık planı " + index + ". pozisyona eklendi.");
            } else {
                System.out.println("Hata: " + index + ". pozisyon dolu.");
            }
        } else {
            System.out.println("Hata: Geçersiz index.");
        }
    }
}
