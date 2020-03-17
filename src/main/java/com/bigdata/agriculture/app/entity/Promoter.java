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
public class Promoter implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer promoterId;

    private String promoterName;

    private String promoterPhone;


    public Integer getPromoterId() {
        return promoterId;
    }

    public void setPromoterId(Integer promoterId) {
        this.promoterId = promoterId;
    }

    public String getPromoterName() {
        return promoterName;
    }

    public void setPromoterName(String promoterName) {
        this.promoterName = promoterName;
    }

    public String getPromoterPhone() {
        return promoterPhone;
    }

    public void setPromoterPhone(String promoterPhone) {
        this.promoterPhone = promoterPhone;
    }

    @Override
    public String toString() {
        return "Promoter{" +
        "promoterId=" + promoterId +
        ", promoterName=" + promoterName +
        ", promoterPhone=" + promoterPhone +
        "}";
    }
}
