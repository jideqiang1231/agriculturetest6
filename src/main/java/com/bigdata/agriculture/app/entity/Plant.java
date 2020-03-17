package com.bigdata.agriculture.app.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class Plant implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "plant_id", type = IdType.AUTO)
    private Integer plantId;

    private Integer userId;

    private Integer seedId;

    private Double plantAcres;

    private LocalDate plantTime;

    private String plantArea;


    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSeedId() {
        return seedId;
    }

    public void setSeedId(Integer seedId) {
        this.seedId = seedId;
    }

    public Double getPlantAcres() {
        return plantAcres;
    }

    public void setPlantAcres(Double plantAcres) {
        this.plantAcres = plantAcres;
    }

    public LocalDate getPlantTime() {
        return plantTime;
    }

    public void setPlantTime(LocalDate plantTime) {
        this.plantTime = plantTime;
    }

    public String getPlantArea() {
        return plantArea;
    }

    public void setPlantArea(String plantArea) {
        this.plantArea = plantArea;
    }

    @Override
    public String toString() {
        return "Plant{" +
        "plantId=" + plantId +
        ", userId=" + userId +
        ", seedId=" + seedId +
        ", plantAcres=" + plantAcres +
        ", plantTime=" + plantTime +
        ", plantArea=" + plantArea +
        "}";
    }
}
