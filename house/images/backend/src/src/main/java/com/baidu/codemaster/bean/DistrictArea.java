package com.baidu.codemaster.bean;

public class DistrictArea {

    private String district;
    private double area;

    public DistrictArea(String district, double area) {
        this.district = district;
        this.area = area;
    }


    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
