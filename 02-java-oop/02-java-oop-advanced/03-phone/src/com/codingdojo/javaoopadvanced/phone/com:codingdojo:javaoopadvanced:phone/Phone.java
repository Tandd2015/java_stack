package com.codingdojo.javaoopadvanced.phone;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters
    public String getVersionNumber() {
        return this.versionNumber;
    }
    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }
    public String getCarrier() {
        return this.carrier;
    }
    public String getRingTone() {
        return this.ringTone;
    }
    // setters 
    public void setVersionNumber(String numberString) {
        this.versionNumber = numberString;
    }
    public void setBatteryPercentage(int numberInt) {
        this.batteryPercentage = numberInt;
    }
    public void setCarrier(String stringString) {
        this.carrier = stringString;
    }
    public void setTone(String stringString) {
        this.ringTone = stringString;
    }
}