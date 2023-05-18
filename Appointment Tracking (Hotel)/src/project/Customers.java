/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Asmz
 */
public class Customers {

    private int id;
    private String nameSurname;
    private int mobileNumber;
    private String nationality;
    private String gender;
    private boolean isGender;
    private String email;
    private int idNumberPassport;
    private String address;

    public Customers(String nameSurname, int mobileNumber, String nationality, boolean isGender, String email, int idNumberPassport, String adress) {
        this.nameSurname = nameSurname;
        this.mobileNumber = mobileNumber;
        this.nationality = nationality;
        this.gender = isGender ? "Male" : "Female";
        this.email = email;
        this.idNumberPassport = idNumberPassport;
        this.address = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isIsGender() {
        return isGender;
    }

    public void setIsGender(boolean isGender) {
        this.isGender = isGender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdNumberPassport() {
        return idNumberPassport;
    }

    public void setIdNumberPassport(int idNumberPassport) {
        this.idNumberPassport = idNumberPassport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
