package com.techelevator.model;

public class Crag {
    private String cragId;
    private String areaId;
    private String cragName;
    private String description;
    private double latitude;
    private double longitude;

    public Crag(String cragId, String areaId, String cragName, String description, double latitude, double longitude) {
        this.cragId = cragId;
        this.areaId = areaId;
        this.cragName = cragName;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Crag() {
    }

    public String getCragId() {
        return cragId;
    }

    public void setCragId(String cragId) {
        this.cragId = cragId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getCragName() {
        return cragName;
    }

    public void setCragName(String cragName) {
        this.cragName = cragName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Crag{" +
                "cragId='" + cragId + '\'' +
                ", areaId='" + areaId + '\'' +
                ", cragName='" + cragName + '\'' +
                ", description='" + description + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}