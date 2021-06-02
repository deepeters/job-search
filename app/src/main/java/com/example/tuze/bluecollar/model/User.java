package com.example.tuze.bluecollar.model;

import org.parceler.Parcel;

import java.io.Serializable;
import java.util.ArrayList;


@Parcel
public class User {
    private String name;
    private String email;
    private String password;
    private String dob;
    private int type;
    private String address;
    private String description;
    private String title;
    private String userId;
    private String profileImage;
    private String lookingFor;

    public User() {

    }

    private ArrayList<String> appliedPostions;

    private ArrayList<String> createdPositions;

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAppliedPostions(ArrayList<String> appliedPostions) {
        this.appliedPostions = appliedPostions;
    }

    public void setCreatedPositions(ArrayList<String> createdPositions) {
        this.createdPositions = createdPositions;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public void setLookingFor(String lookingFor) {
        this.lookingFor = lookingFor;
    }

    public String getEmail() {
        if (email != null)
            return email;
        else
            return "";
    }

    public int getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        if (description != null)
            return description;
        else
            return "";
    }

    public String getDob() {
        if (dob != null)
            return dob;
        else
            return "";
    }

    public String getName() {
        if (name != null)
            return name;
        else
            return "";
    }

    public String getPassword() {
        if (password != null)
            return password;
        else
            return "";
    }

    public ArrayList<String> getAppliedPostions() {
        return appliedPostions;
    }

    public ArrayList<String> getCreatedPositions() {
        return createdPositions;
    }

    public String getTitle() {
        if (title != null)
            return title;
        else
            return "";
    }

    public String getUserId() {
        return userId;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public String getLookingFor() {
        if (lookingFor != null)
            return lookingFor;
        else
            return "";
    }
}
