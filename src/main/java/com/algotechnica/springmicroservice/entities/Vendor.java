package com.algotechnica.springmicroservice.entities;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Vendor {
    private String code;
    private String companyName;
    private String contactPerson;
    private String firstName;
    private String lastName;
    private String email;

    private String website;
    private Integer status;
    private Date regDate;


    public Vendor() {
        this.code = "code";
        this.companyName = "companyName";
        this.contactPerson = "contactPerson";
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.email = this.firstName + "." + this.lastName + "@" + this.companyName + "gmail.com";
        this.website = "www." + this.companyName + ".com";
        this.status = 0;
        this.regDate = new Date();
    }

    public Vendor(String code, String companyName, String contactPerson, String firstName, String lastName) {
        this.code = code;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = this.firstName + "." + this.lastName + "@" + this.companyName + "gmail.com";
        this.website = "www." + this.companyName + ".com";
        this.status = 0;
        this.regDate = new Date();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Vendor [ Code : " + getCode() + ",  CompanyName : " + getCompanyName()
                + ", getContactPerson : " + getContactPerson() + ", getFirstName :" + getFirstName()
                + ", getLastName : " + getLastName() + ", getEmail : " + getEmail() + ", getWebsite :"
                + getWebsite() + ", getStatus : " + getStatus() + ", getRegDate : " + getRegDate()
                + ", getClass : " + getClass() + "]";
    }

}
