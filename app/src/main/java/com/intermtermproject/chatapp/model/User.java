package com.intermtermproject.chatapp.model;

public class User {

    private String uid, name, phoneNumber, profileImage, token;

    public User() {
    }

//    public User(String uid, String name, String phoneNumber, String profileImage, String token) {
//        this.uid = uid;
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//        this.profileImage = profileImage;
//        this.token = token;
//    }

    public User(String uid, String name, String phone, String imageUrl) {
        this.uid = uid;
        this.name = name;
        this.phoneNumber = phone;
        this.profileImage = imageUrl;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
