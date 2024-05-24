package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        mainTest();
    }

    public static void mainTest(){
        String[] healtnames = new String[2];
        String[] developnames = new String[6];

        Employee employee = new Employee(120,"fevzi kayaönü","fevzi123","asd@asdasd.com",healtnames);
        Company company = new Company(124,"fevzi",5.2,developnames);
        Healthplan healthplan = new Healthplan(125,"fevzi", Plan.BASIC );

        System.out.println(employee.toString());
        System.out.println(company.toString());
        System.out.println(healthplan.toString());
    }
}