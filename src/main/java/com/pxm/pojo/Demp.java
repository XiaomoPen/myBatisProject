package com.pxm.pojo;

public class Demp {

    private String name;
    private String address;

    public Demp() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Demp{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
