package com.katey268.web.entity;

/**
 * Created by 11456 on 2016/12/30.
 */
public class Geocode {

    /**
     * 无参构造
     */
    public Geocode(){}

    /**
     * 全参数构造方法
     * @param geocode
     * @param provinceCode
     * @param cityCode
     * @param districtCode
     * @param blockCode
     * @param geoName
     */
    public Geocode(long geocode, int provinceCode, int cityCode, int districtCode, int blockCode, String geoName) {
        this.geocode = geocode;
        this.provinceCode = provinceCode;
        this.cityCode = cityCode;
        this.districtCode = districtCode;
        this.blockCode = blockCode;
        this.geoName = geoName;
    }

    /**
     * 地理编码
     */
    private long geocode;

    public void setGeocode(long geocode) {
        this.geocode = geocode;
    }
    public long getGeocode() {
        return geocode;
    }

    /**
     * 省份编码
     */
    private int provinceCode;

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    /**
     * 城市编码
     */
    private int cityCode;

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    /**
     * 县区编码
     */
    private int districtCode;

    public void setDistrictCode(int districtCode) {
        this.districtCode = districtCode;
    }

    public int getDistrictCode() {
        return districtCode;
    }

    /**
     * 街区编码
     */
    private int blockCode;

    public void setBlockCode(int blockCode) {
        this.blockCode = blockCode;
    }

    public int getBlockCode() {
        return blockCode;
    }

    /**
     * 地理名
     */
    private String geoName;

    public void setGeoName(String geoName) {
        this.geoName = geoName;
    }

    public String getGeoName() {
        return geoName;
    }

    @Override
    public String toString() {
        return "Geocode{" +
                "geocode=" + geocode +
                ", provinceCode=" + provinceCode +
                ", cityCode=" + cityCode +
                ", districtCode=" + districtCode +
                ", blockCode=" + blockCode +
                ", geoName='" + geoName + '\'' +
                '}';
    }
}
