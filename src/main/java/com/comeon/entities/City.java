package com.comeon.entities;

import java.util.Collection;
import java.util.UUID;

public class City {

        private final String cityId;
        private String cityName;
        private String country;
        private String region;

        private Collection<Address> addresses;

    public City() {
        this.cityId = UUID.randomUUID().toString();
    }

    public City(String cityName, String country, String region) {
        this.cityId = UUID.randomUUID().toString();
        this.cityName = cityName;
        this.country = country;
        this.region = region;
    }

    public City(String cityId, String cityName, String country, String region) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.country = country;
        this.region = region;
    }

    public String getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Collection<Address> getAddresses(){
        return addresses;
    }

    public void setAddresses(Collection<Address> addresses){
        this.addresses = addresses;
    }

}
