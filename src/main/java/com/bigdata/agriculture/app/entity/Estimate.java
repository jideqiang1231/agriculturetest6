package com.bigdata.agriculture.app.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jdq
 * @since 2020-03-14
 */
public class Estimate implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "estimate_id", type = IdType.AUTO)
    private Integer estimateId;

    private String userName;

    private String seedName;

    private Double fertilizerCost;

    private Double pesticideCost;

    private Double seedCost;

    private Double acres;

    private Double cost;

    private Double income;


    public Integer getEstimateId() {
        return estimateId;
    }

    public void setEstimateId(Integer estimateId) {
        this.estimateId = estimateId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSeedName() {
        return seedName;
    }

    public void setSeedName(String seedName) {
        this.seedName = seedName;
    }

    public Double getFertilizerCost() {
        return fertilizerCost;
    }

    public void setFertilizerCost(Double fertilizerCost) {
        this.fertilizerCost = fertilizerCost;
    }

    public Double getPesticideCost() {
        return pesticideCost;
    }

    public void setPesticideCost(Double pesticideCost) {
        this.pesticideCost = pesticideCost;
    }

    public Double getSeedCost() {
        return seedCost;
    }

    public void setSeedCost(Double seedCost) {
        this.seedCost = seedCost;
    }

    public Double getAcres() {
        return acres;
    }

    public void setAcres(Double acres) {
        this.acres = acres;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Estimate{" +
        "estimateId=" + estimateId +
        ", userName=" + userName +
        ", seedName=" + seedName +
        ", fertilizerCost=" + fertilizerCost +
        ", pesticideCost=" + pesticideCost +
        ", seedCost=" + seedCost +
        ", acres=" + acres +
        ", cost=" + cost +
        ", income=" + income +
        "}";
    }
}
