package com.blockchain.TranhNFT.dto.request;

import java.io.Serializable;

public class UserRequestDTO implements Serializable {
    private int userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userAddress;
    private String phone;
    private String role;

    public UserRequestDTO(int userId, String userName, String userEmail, String userPassword, String userAddress, String phone, String role) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userAddress = userAddress;
        this.phone = phone;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getPhone() {
        return phone;
    }

    public String getRole() {
        return role;
    }
}
