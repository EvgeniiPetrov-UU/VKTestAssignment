package com.vk.demo.model.dto;

import com.vk.demo.model.entity.user.userInfo.Address;
import com.vk.demo.model.entity.user.userInfo.Company;

public class UserDto {

    private Long id;
    private String email;
    private String username;
    private String name;
    private String phone;
    private String website;
    private Company company;
    private Address address;

    public UserDto() {

    }

    public UserDto(Long id, String email, String username, String name, String phone, String website, Company company, Address address) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.name = name;
        this.phone = phone;
        this.website = website;
        this.company = company;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
