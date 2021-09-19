package com.example.covid_19tracker;

public class mood {
    private String name,active,confirmed,migratedother,deceased,recovered,dconfirmed,ddeceased,drecovered;

    public mood(String name, String active, String confirmed, String migratedother, String deceased, String recovered, String dconfirmed, String ddeceased, String drecovered) {
        this.name = name;
        this.active = active;
        this.confirmed = confirmed;
        this.deceased = deceased;
        this.recovered = recovered;
        this.dconfirmed = dconfirmed;
        this.ddeceased = ddeceased;
        this.drecovered = drecovered;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getActive() {
        return active;
    }
    public void setActive(String active) {
        this.active = active;
    }

    public String getConfirmed() {
        return confirmed;
    }
    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getDeceased() {
        return deceased;
    }
    public void setDeceased(String deceased) {
        this.deceased = deceased;
    }

    public String getRecovered() {
        return recovered;
    }
    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getDconfirmed() {
        return dconfirmed;
    }
    public void setDconfirmed(String dconfirmed) {
        this.dconfirmed = dconfirmed;
    }

    public String getDdeceased() {
        return ddeceased;
    }
    public void setDdeceased(String ddeceased) {
        this.ddeceased = ddeceased;
    }

    public String getDrecovered() {
        return drecovered;
    }
    public void setDrecovered(String drecovered) {
        this.drecovered = drecovered;
    }
}