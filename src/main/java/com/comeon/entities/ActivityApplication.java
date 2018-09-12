package com.comeon.entities;

import java.util.Calendar;
import java.util.Collection;
import java.util.UUID;

public class ActivityApplication {

    private final String actionId;
    private int countOfPeople;
    private String message;
    private String GPS;
    private String activityType;
    private String personId;
    private String addressId;
    private Calendar data;

    private Collection<Person> personCollection;
    private Collection<ActivityComment> activityComments;

    private ActivityLibrary activityLibrary;
    private Address address;
    private Person AdminOfActivity;

    public ActivityApplication() {
        this.actionId = UUID.randomUUID().toString();
    }

    public ActivityApplication(int countOfPeople, String message, String activityType, Calendar data, String peronId, String addressId) {
        this.actionId = UUID.randomUUID().toString();
        this.countOfPeople = countOfPeople;
        this.message = message;
        this.activityType = activityType;
        this.data = data;
        this.personId = peronId;
        this.addressId = addressId;
    }

    public ActivityApplication(String actionId, int countOfPeople, String message, String activityType, Calendar data, String peronId, String addressId) {
        this.actionId = actionId;
        this.countOfPeople = countOfPeople;
        this.message = message;
        this.activityType = activityType;
        this.data = data;
        this.personId = peronId;
        this.addressId = addressId;
    }

    public String getActionId() {
        return actionId;
    }

    public int getCountOfPeople() {
        return countOfPeople;
    }

    public void setCountOfPeople(int countOfPeople) {
        this.countOfPeople = countOfPeople;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getGPS() {
        return GPS;
    }

    public void setGPS(String GPS) {
        this.GPS = GPS;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public Collection<Person> getPersonCollection() {
        return personCollection;
    }

    public void setPersonCollection(Collection<Person> personCollection) {
        this.personCollection = personCollection;
    }

    public Collection<ActivityComment> getActivityComments() {
        return activityComments;
    }

    public void setActivityComments(Collection<ActivityComment> activityComments) {
        this.activityComments = activityComments;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ActivityLibrary getActivityLibrary() {
        return activityLibrary;
    }

    public void setActivityLibrary(ActivityLibrary activityLibrary) {
        this.activityLibrary = activityLibrary;
    }

    public Person getAdminOfActivity() {
        return AdminOfActivity;
    }

    public void setAdminOfActivity(Person adminOfActivity) {
        AdminOfActivity = adminOfActivity;
    }
}
