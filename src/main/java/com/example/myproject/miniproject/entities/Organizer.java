package com.example.myproject.miniproject.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "organizer")
public class Organizer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String organization_email;

    @Column(nullable = false)
    private String organization_phone;

    @Column(nullable = false)
    private String website;

    public Organizer() {
    }

    public Organizer(int id, String name, String address, String organization_email, String organization_phone, String website) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.organization_email = organization_email;
        this.organization_phone = organization_phone;
        this.website = website;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getOrganization_email() {
        return organization_email;
    }

    public void setOrganization_email(String organization_email) {
        this.organization_email = organization_email;
    }

    public String getOrganization_phone() {
        return organization_phone;
    }

    public void setOrganization_phone(String organization_phone) {
        this.organization_phone = organization_phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "organizerEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", organization_email='" + organization_email + '\'' +
                ", organization_phone='" + organization_phone + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
