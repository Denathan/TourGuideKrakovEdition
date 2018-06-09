package com.example.rodak.tourguidekrakovedition;

public class ItemDTO implements ListItem {
    public String name;
    public String dscrb;
    public String openingTime;
    public String rate;

    public ItemDTO(String name, String dscrb, String openingTime, String rate) {
        this.name = name;
        this.dscrb = dscrb;
        this.openingTime = openingTime;
        this.rate = rate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDscrb() {
        return dscrb;
    }

    @Override
    public String getOpeningTime() {
        return openingTime;
    }

    @Override
    public String getRate() {
        return rate;
    }

    @Override
    public int getPhoto() {
        return 0;
    }
}
