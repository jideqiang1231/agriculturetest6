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
public class Seedevaluation implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "seedeevaluation_id", type = IdType.AUTO)
    private Integer seedeevaluationId;

    private Integer userId;

    private Integer seedId;

    private String seedeevaluationContent;

    private Double seedeevaluationScore;

    private LocalDate seedeevaluationTime;


    public Integer getSeedeevaluationId() {
        return seedeevaluationId;
    }

    public void setSeedeevaluationId(Integer seedeevaluationId) {
        this.seedeevaluationId = seedeevaluationId;
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

    public String getSeedeevaluationContent() {
        return seedeevaluationContent;
    }

    public void setSeedeevaluationContent(String seedeevaluationContent) {
        this.seedeevaluationContent = seedeevaluationContent;
    }

    public Double getSeedeevaluationScore() {
        return seedeevaluationScore;
    }

    public void setSeedeevaluationScore(Double seedeevaluationScore) {
        this.seedeevaluationScore = seedeevaluationScore;
    }

    public LocalDate getSeedeevaluationTime() {
        return seedeevaluationTime;
    }

    public void setSeedeevaluationTime(LocalDate seedeevaluationTime) {
        this.seedeevaluationTime = seedeevaluationTime;
    }

    @Override
    public String toString() {
        return "Seedevaluation{" +
        "seedeevaluationId=" + seedeevaluationId +
        ", userId=" + userId +
        ", seedId=" + seedId +
        ", seedeevaluationContent=" + seedeevaluationContent +
        ", seedeevaluationScore=" + seedeevaluationScore +
        ", seedeevaluationTime=" + seedeevaluationTime +
        "}";
    }
}
