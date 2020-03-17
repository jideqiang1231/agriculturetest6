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
public class Buy implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "buy_id", type = IdType.AUTO)
    private Integer buyId;

    private Integer userId;

    private Integer buyType;

    private String objectsName;

    private Integer buyNum;

    private LocalDate buyTime;


    public Integer getBuyId() {
        return buyId;
    }

    public void setBuyId(Integer buyId) {
        this.buyId = buyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBuyType() {
        return buyType;
    }

    public void setBuyType(Integer buyType) {
        this.buyType = buyType;
    }

    public String getObjectsName() {
        return objectsName;
    }

    public void setObjectsName(String objectsName) {
        this.objectsName = objectsName;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public LocalDate getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(LocalDate buyTime) {
        this.buyTime = buyTime;
    }

    @Override
    public String toString() {
        return "Buy{" +
        "buyId=" + buyId +
        ", userId=" + userId +
        ", buyType=" + buyType +
        ", objectsName=" + objectsName +
        ", buyNum=" + buyNum +
        ", buyTime=" + buyTime +
        "}";
    }
}
