package com.baidu.codemaster.dal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "code_master_demo")
public class HouseInfo {

    @Column(name = "id")
    private String id;

    @Column(name = "district")
    private String district;

    @Column(name = "title")
    private String title;

    @Column(name = "total_price")
    private Integer totalPrice;

    @Column(name = "unit_price")
    private Integer unitPrice;

    @Column(name = "house_type")
    private String houseType;

    @Column(name = "area")
    private double area;

    @Column(name = "orientation")
    private String orientation;

    @Column(name = "residential_zone")
    private String residentialZone;

    @Column(name = "tag")
    private String tag;

    @Column(name = "image")
    private String image;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "contact_phone")
    private String contactPhone;

    public HouseInfo() {

    }

    public HouseInfo(String id, String district, String title, Integer totalPrice, Integer unitPrice,
                     String houseType, double area, String orientation, String residentialZone, String tag,
                     String image, String contactName, String contactPhone) {
        this.id = id;
        this.district = district;
        this.title = title;
        this.totalPrice = totalPrice;
        this.unitPrice = unitPrice;
        this.houseType = houseType;
        this.area = area;
        this.orientation = orientation;
        this.residentialZone = residentialZone;
        this.tag = tag;
        this.image = image;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getResidentialZone() {
        return residentialZone;
    }

    public void setResidentialZone(String residentialZone) {
        this.residentialZone = residentialZone;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
