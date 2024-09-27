package com.aori.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "houses")
public class House {
    private Long houseId;
    private String address;
    private String Name;
    private int totalFloors;
    private int builtYear;
    @ManyToOne
    @JoinColumn(name = "construction_company_id")
    private ConstructionCompany constructionCompany;
    @Id
    private Long id;

    // Геттеры и сеттеры
    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(int builtYear) {
        this.builtYear = builtYear;
    }

    public ConstructionCompany getConstructionCompany() {
        return constructionCompany;
    }

    public void setConstructionCompany(ConstructionCompany constructionCompany) {
        this.constructionCompany = constructionCompany;
    }
    public String getName() { return Name;}

    public void setName(String name) { this.Name = name;}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

