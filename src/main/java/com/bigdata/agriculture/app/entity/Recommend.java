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
public class Recommend implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "recommend_id", type = IdType.AUTO)
    private Integer recommendId;

    private Integer specilistId;

    private Integer cropType;

    private LocalDate recommendTime;

    private String recommendContent;

    private String recommendArea;

    private Integer recommendType;


    public Integer getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(Integer recommendId) {
        this.recommendId = recommendId;
    }

    public Integer getSpecilistId() {
        return specilistId;
    }

    public void setSpecilistId(Integer specilistId) {
        this.specilistId = specilistId;
    }

    public Integer getCropType() {
        return cropType;
    }

    public void setCropType(Integer cropType) {
        this.cropType = cropType;
    }

    public LocalDate getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(LocalDate recommendTime) {
        this.recommendTime = recommendTime;
    }

    public String getRecommendContent() {
        return recommendContent;
    }

    public void setRecommendContent(String recommendContent) {
        this.recommendContent = recommendContent;
    }

    public String getRecommendArea() {
        return recommendArea;
    }

    public void setRecommendArea(String recommendArea) {
        this.recommendArea = recommendArea;
    }

    public Integer getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(Integer recommendType) {
        this.recommendType = recommendType;
    }

    @Override
    public String toString() {
        return "Recommend{" +
        "recommendId=" + recommendId +
        ", specilistId=" + specilistId +
        ", cropType=" + cropType +
        ", recommendTime=" + recommendTime +
        ", recommendContent=" + recommendContent +
        ", recommendArea=" + recommendArea +
        ", recommendType=" + recommendType +
        "}";
    }
}
