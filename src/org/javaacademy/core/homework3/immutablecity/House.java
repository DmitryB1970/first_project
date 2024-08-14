package org.javaacademy.core.homework3.immutablecity;

public class House {

    private String streetName;
    private int houseNumber;

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public House(int houseNumber, String streetName) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("House{");
        sb.append("houseNumber=").append(houseNumber);
        sb.append(", streetName='").append(streetName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
