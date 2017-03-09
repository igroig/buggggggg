package com.example.gio.realmdatabase;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;



public class Person extends RealmObject {

    @PrimaryKey
    public int id;
    //==================================================================================================================
    private String name;
    private String lastName;

    public Person() {
        id=++MainActivity.id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
