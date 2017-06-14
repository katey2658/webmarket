package com.katey268.web.entity;

/**
 * Created by 11456 on 2016/12/30.
 */
public class Address {
    /**
     * 地址信息编号
     */
    private long addressId;

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public long getAddressId() {
        return addressId;
    }

    /**
     * 对象编号
     */
    private long userId;

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    /**
     * 收件人姓名
     */
    private String consigneeName;

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * 联系方式
     */
    private String contractTel;

    public void setContractTel(String contractTel) {
        this.contractTel = contractTel;
    }

    public String getContractTel() {
        return contractTel;
    }

    /**
     * 地理信息编码
     */
    private long geocodeId;

    public void setGeocodeId(long geocodeId) {
        this.geocodeId = geocodeId;
    }

    public long getGeocodeId() {
        return geocodeId;
    }

    /**
     * 地理信息
     */
    private Geocode geocode;

    public void setGeocode(Geocode geocode) {
        this.geocode = geocode;
    }

    public Geocode getGeocode() {
        return geocode;
    }

    /**
     * 收货地址
     */
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", userId=" + userId +
                ", consigneeName='" + consigneeName + '\'' +
                ", contractTel='" + contractTel + '\'' +
                ", geocode=" + geocode +
                ", address='" + address + '\'' +
                '}';
    }
}
