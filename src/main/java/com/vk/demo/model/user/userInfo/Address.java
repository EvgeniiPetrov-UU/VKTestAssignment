package com.vk.demo.model.user.userInfo;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable {

    private static final long serialVersionUID = -6791346442970943107L;
    private String city;
    private String street;
    private String suite;
    private String zipcode;
    private Geo geo;

    public Address() {

    }

    public Address(String city, String street, String suite, String zipcode, Geo geo) {
        this.city = city;
        this.street = street;
        this.suite = suite;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("city='").append(city).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", suite='").append(suite).append('\'');
        sb.append(", zipcode='").append(zipcode).append('\'');
        sb.append(", geo=").append(geo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return city.equals(address.city)
                && street.equals(address.street)
                && suite.equals(address.suite)
                && zipcode.equals(address.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, suite, zipcode);
    }
}
