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
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    private String userName;

    private String userPass;

    private String userPhone;

    private String userCard;

    private String userFieldadress;

    private Double userFieldacres;

    private String userFoodcrops;

    private String userFoodcropsvariety;

    private Double userFoodcropsacres;

    private String userEconomycrops;

    private String userEconomycropsvariety;

    private Double userEconomycropsacres;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    public String getUserFieldadress() {
        return userFieldadress;
    }

    public void setUserFieldadress(String userFieldadress) {
        this.userFieldadress = userFieldadress;
    }

    public Double getUserFieldacres() {
        return userFieldacres;
    }

    public void setUserFieldacres(Double userFieldacres) {
        this.userFieldacres = userFieldacres;
    }

    public String getUserFoodcrops() {
        return userFoodcrops;
    }

    public void setUserFoodcrops(String userFoodcrops) {
        this.userFoodcrops = userFoodcrops;
    }

    public String getUserFoodcropsvariety() {
        return userFoodcropsvariety;
    }

    public void setUserFoodcropsvariety(String userFoodcropsvariety) {
        this.userFoodcropsvariety = userFoodcropsvariety;
    }

    public Double getUserFoodcropsacres() {
        return userFoodcropsacres;
    }

    public void setUserFoodcropsacres(Double userFoodcropsacres) {
        this.userFoodcropsacres = userFoodcropsacres;
    }

    public String getUserEconomycrops() {
        return userEconomycrops;
    }

    public void setUserEconomycrops(String userEconomycrops) {
        this.userEconomycrops = userEconomycrops;
    }

    public String getUserEconomycropsvariety() {
        return userEconomycropsvariety;
    }

    public void setUserEconomycropsvariety(String userEconomycropsvariety) {
        this.userEconomycropsvariety = userEconomycropsvariety;
    }

    public Double getUserEconomycropsacres() {
        return userEconomycropsacres;
    }

    public void setUserEconomycropsacres(Double userEconomycropsacres) {
        this.userEconomycropsacres = userEconomycropsacres;
    }

    @Override
    public String toString() {
        return "User{" +
        "userId=" + userId +
        ", userName=" + userName +
        ", userPass=" + userPass +
        ", userPhone=" + userPhone +
        ", userCard=" + userCard +
        ", userFieldadress=" + userFieldadress +
        ", userFieldacres=" + userFieldacres +
        ", userFoodcrops=" + userFoodcrops +
        ", userFoodcropsvariety=" + userFoodcropsvariety +
        ", userFoodcropsacres=" + userFoodcropsacres +
        ", userEconomycrops=" + userEconomycrops +
        ", userEconomycropsvariety=" + userEconomycropsvariety +
        ", userEconomycropsacres=" + userEconomycropsacres +
        "}";
    }
}
