package com.bigdata.agriculture.app.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jdq
 * @since 2020-03-14
 */
public class Product implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer productId;

    private Integer userId;

    private String seedName;

    private String productName;

    private Double productYield;

    private String productLevel;

    private String productFeatures;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSeedName() {
        return seedName;
    }

    public void setSeedName(String seedName) {
        this.seedName = seedName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductYield() {
        return productYield;
    }

    public void setProductYield(Double productYield) {
        this.productYield = productYield;
    }

    public String getProductLevel() {
        return productLevel;
    }

    public void setProductLevel(String productLevel) {
        this.productLevel = productLevel;
    }

    public String getProductFeatures() {
        return productFeatures;
    }

    public void setProductFeatures(String productFeatures) {
        this.productFeatures = productFeatures;
    }

    @Override
    public String toString() {
        return "Product{" +
        "productId=" + productId +
        ", userId=" + userId +
        ", seedName=" + seedName +
        ", productName=" + productName +
        ", productYield=" + productYield +
        ", productLevel=" + productLevel +
        ", productFeatures=" + productFeatures +
        "}";
    }
}
