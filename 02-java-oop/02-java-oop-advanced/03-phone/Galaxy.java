// package com.codingdojo.javaoopadvanced.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone();
    }
    @Override
    public String unlock() {
        String unlockMethodOne = "Password";
        return unlockMethodOne;
    }
    @Override
    public void displayInfo() {
        System.out.println(String.format("Version Number: %s", this.getVersionNumber()));
        System.out.println("Battery Percentage: " + this.getBatteryPercentage());
        String carrierString = "Carrier: ".concat(this.getCarrier());
        System.out.println(carrierString);
        System.out.println("Ring Tone: " + this.getRingTone());
    }
}