// package com.codingdojo.javaoopadvanced.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone();
    }
    @Override
    public String unlock() {
        String unlockMethodTwo = "line-pattern";
        return unlockMethodTwo;
    }
    @Override
    public void displayInfo() {
        System.out.println(String.format("Version Number: %s", this.getVersionNumber()));
        System.out.println("Battery Percentage: " + this.getBatteryPercentage());
        System.out.println("Carrier: " + this.getCarrier());
        System.out.println("Ring Tone: " + this.getRingTone());
    }
}