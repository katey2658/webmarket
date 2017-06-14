package com.katey268.web.entity;

import java.util.Date;


/**
 * Created by 11456 on 2016/12/27.
 * 产品的详细：在详情页面地方应该要有补充产品和其它同类型产品
 */
public class ProductInfo {

    /**
     * 产品编号
     */
    private long productId;

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getProductId() {
        return productId;
    }

    /**
     * 产品
     */
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    /**
     * 产品的更多描述图片
     */
    private String images;

    public void setImages(String images) {
        this.images = images;
    }

    public String getImages() {
        return images;
    }

    /**
     * 相关提示
     */
    private String goodToKnow;

    public void setGoodToKnow(String goodToKnow) {
        this.goodToKnow = goodToKnow;
    }

    public String getGoodToKnow() {
        return goodToKnow;
    }

    /**
     * 保养说明（建议直接写成html直接写到数据库中）
     */
    private String careInst;

    public void setCareInst(String careInst) {
        this.careInst = careInst;
    }

    public String getCareInst() {
        return careInst;
    }

    /**
     * 产品材料描述
     */
    private String cusMaterials;

    public void setCusMaterials(String cusMaterials) {
        this.cusMaterials = cusMaterials;
    }

    public String getCusMaterials() {
        return cusMaterials;
    }

    /**
     * 产品规格
     */
    private String measurePart;

    public void setMeasurePart(String measurePart) {
        this.measurePart = measurePart;
    }

    public String getMeasurePart() {
        return measurePart;
    }

    /**
     * 文档，应该提供下载
     */
    private String docsFile;

    public void setDocsFile(String docsFile) {
        this.docsFile = docsFile;
    }

    public String getDocsFile() {
        return docsFile;
    }

    /**
     * 重要特征
     */
    private String keyFeatures;

    public void setKeyFeatures(String keyFeatures) {
        this.keyFeatures = keyFeatures;
    }

    public String getKeyFeatures() {
        return keyFeatures;
    }

    /**
     * 设计者
     */
    private String designer;

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getDesigner() {
        return designer;
    }

    /**
     * 设计灵感
     */
    private String designThoughts;

    public void setDesignThoughts(String designThoughts) {
        this.designThoughts = designThoughts;
    }

    public String getDesignThoughts() {
        return designThoughts;
    }

    /**
     * 包装详情
     */
    private String packageInfo;

    public void setPackageInfo(String packageInfo) {
        this.packageInfo = packageInfo;
    }

    public String getPackageInfo() {
        return packageInfo;
    }

    /**
     * 创建时间
     */
    private Date createTime;

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }


    @Override
    public String toString() {
        return "ProductInfo{" +
                "productId=" + productId +
                ", product=" + product +
                ", images='" + images + '\'' +
                ", goodToKnow='" + goodToKnow + '\'' +
                ", careInst='" + careInst + '\'' +
                ", cusMaterials='" + cusMaterials + '\'' +
                ", measurePart='" + measurePart + '\'' +
                ", docsFile='" + docsFile + '\'' +
                ", keyFeatures='" + keyFeatures + '\'' +
                ", designer='" + designer + '\'' +
                ", designThoughts='" + designThoughts + '\'' +
                ", packageInfo='" + packageInfo + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
