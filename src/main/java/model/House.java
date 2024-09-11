package model;


public class House {
    private String houseId;
    private String address;
    private String Name;
    private int totalFloors;
    private int builtYear;
    private ConstructionCompany constructionCompany;

    // Геттеры и сеттеры
    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
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
    public void setName(String name) { Name = name;}
}

