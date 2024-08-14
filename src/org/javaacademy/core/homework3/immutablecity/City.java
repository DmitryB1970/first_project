package org.javaacademy.core.homework3.immutablecity;

import java.util.Arrays;


public final class City {

    private final String city;
    private final House[] house;

    public City(String city, House[] houses) {
        this.city = city;
        this.house = houses;
    }

    public String getCity() {
        return city;
    }

    public House[] getHouse() {
        return house;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("city='").append(city).append('\'');
        sb.append(", house=").append(Arrays.toString(house));
        sb.append('}');
        return sb.toString();
    }
}
