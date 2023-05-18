/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author Asmz
 */
public class Room {

    private int roomNumber;
    private String roomType;
    private boolean isAC;
    private String bed;
    private double price;
    private String clean;
    private boolean isClean = true;
    private String availability;
    private boolean isAvailable = true;

    public Room() {
    }

    public Room(int roomNumber, boolean isAC, String bed, double price) {
        this.roomNumber = roomNumber;
        this.roomType = isAC ? "AC" : "Non-AC";
        this.bed = bed;
        this.price = price;
        this.clean = isClean ? "Clean" : "Dirty";
        this.availability = isAvailable ? "Available" : "Unavailable";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getClean() {
        return clean;
    }

    public void setClean(String clean) {
        this.clean = clean;
    }

    public String getAvailability() {
        return availability;
    }

    public boolean isIsAC() {
        return isAC;
    }

    public void setIsAC(boolean isAC) {
        this.isAC = isAC;
    }

    public boolean isIsClean() {
        return isClean;
    }

    public void setIsClean(boolean isClean) {
        this.isClean = isClean;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
