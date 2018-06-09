package com.example.rodak.tourguidekrakovedition;

public class HotelDTO implements ListItem {
    public String name;
    public String dscrb;
    public String openingTime;
    public String rate;
    int photoSrc;

    public HotelDTO(String name, String dscrb, String openingTime, String rate, int photo) {
        this.name = name;
        this.dscrb = dscrb;
        this.openingTime = openingTime;
        this.rate = rate;
        this.photoSrc = photo;
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
        return photoSrc;
    }
}
