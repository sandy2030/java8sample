package com.java8;

/**
 * Created by sande on 19-06-2022.
 */
public class Address {
    private String flatNo;
    private String block;
    private String Area;
    private String pin;

    public Address(String flatNo, String block, String area, String pin) {
        this.flatNo = flatNo;
        this.block = block;
        Area = area;
        this.pin = pin;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", block='" + block + '\'' +
                ", Area='" + Area + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
