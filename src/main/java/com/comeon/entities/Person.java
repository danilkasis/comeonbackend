package com.comeon.entities;

import java.util.Collection;
import java.util.UUID;

public class Person {

    private final String personId;
    private String firstName;
    private String surName;
    private String middleName;

    private String rang;
    private int age;
    private String male;
    private long level;

    private Collection<PersonComment> personComments;
    private Collection<ActivityApplication> activity;

    public Person() {
        this.personId = UUID.randomUUID().toString();
    }

    public Person(String firstName, String surName, String middleName, int age, String male) {
        this.personId = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.surName = surName;
        this.middleName = middleName;
        this.age = age;
        this.male = male;
    }

    public Person(String personId, String firstName, String surName, String middleName, int age, String male) {
        this.personId = personId;
        this.firstName = firstName;
        this.surName = surName;
        this.middleName = middleName;
        this.age = age;
        this.male = male;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public void setLevel(long level) {
        this.level = level;
    }

    public void setPersonComments(Collection personComments) {
        this.personComments = personComments;
    }

    public void setActivity(Collection activity) {
        this.activity = activity;
    }

    public String getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getRang() {
        return rang;
    }

    public int getAge() {
        return age;
    }

    public String getMale() {
        return male;
    }

    public long getLevel() {
        return level;
    }

    public Collection getPersonComments() {
        return personComments;
    }

    public Collection getActivity() {
        return activity;
    }
}

