package org.example;

import org.example.enums.Plan;

public class Healthplan {

    public static Object Plan;
    private int id;
    private String name;
    private Plan plan;

    public Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }
}
