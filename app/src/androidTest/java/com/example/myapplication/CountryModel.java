package com.example.myapplication;

public class CountryModel {

    private String country_name;
    private int contry_image;

    public CountryModel(String country_name, int contry_image) {
        this.country_name = country_name;
        this.contry_image = contry_image;
    }

    public CountryModel() {
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public int getContry_image() {
        return contry_image;
    }

    public void setContry_image(int contry_image) {
        this.contry_image = contry_image;
    }
}
