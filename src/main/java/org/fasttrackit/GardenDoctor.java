package org.fasttrackit;

public class GardenDoctor {
    private String nameDr;
    private String experience;   // how many years of experience
    private double ageDr;
    private double costDr;   // per $

    public String getNameDr() {
        return nameDr;
    }

    public void setNameDr(String nameDr) {
        this.nameDr = nameDr;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public double getAgeDr() {
        return ageDr;
    }

    public void setAgeDr(double ageDr) {
        this.ageDr = ageDr;
    }

    public double getCostDr() {
        return costDr;
    }

    public void setCostDr(double costDr) {
        this.costDr = costDr;
    }
}
