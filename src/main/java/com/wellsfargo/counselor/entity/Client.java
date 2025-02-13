package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Client {

    @Id
    @GeneratedValue
    private long clientId;

    @Column(nullable = false)
    private long firstName;

    @Column(nullable = false)
    private long lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private long phoneNumber;

    @Column(nullable = false)
    private String emailId;

    public long getClientId() {
        return clientId;
    }

    public long getFirstName() {
        return firstName;
    }

    public long getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public void setFirstName(long firstName) {
        this.firstName = firstName;
    }

    public void setLastName(long lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Client(long firstName, long lastName, String address, long phoneNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public Client() {
    }
}
