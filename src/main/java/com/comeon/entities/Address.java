package com.comeon.entities;

import java.util.Collection;
import java.util.UUID;

public class Address {

    private final String addressId;
    private String street;
    private String houseNumber;
    private String housing;
    private String cityId;

    private Collection<ActivityApplication> activityApplications;

    private City city;

    public Address() {
        this.addressId = UUID.randomUUID().toString();
    }

    public Address(String street, String houseNumber, String housing, String cityId) {
        this.addressId = UUID.randomUUID().toString();
        this.street = street;
        this.houseNumber = houseNumber;
        this.housing = housing;
        this.cityId = cityId;
    }

    public Address(String addressId, String street, String houseNumber, String housing, String cityId) {
        this.addressId = addressId;
        this.street = street;
        this.houseNumber = houseNumber;
        this.housing = housing;
        this.cityId = cityId;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Collection<ActivityApplication> getActivityApplications(){
        return activityApplications;
    }

    public void setActivityApplications(Collection<ActivityApplication> activityApplications){
        this.activityApplications = activityApplications;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
