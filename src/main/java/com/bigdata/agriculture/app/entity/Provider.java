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
public class Provider implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer providerId;

    private String providerName;

    private String providerPhone;

    private String provideType;


    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderPhone() {
        return providerPhone;
    }

    public void setProviderPhone(String providerPhone) {
        this.providerPhone = providerPhone;
    }

    public String getProvideType() {
        return provideType;
    }

    public void setProvideType(String provideType) {
        this.provideType = provideType;
    }

    @Override
    public String toString() {
        return "Provider{" +
        "providerId=" + providerId +
        ", providerName=" + providerName +
        ", providerPhone=" + providerPhone +
        ", provideType=" + provideType +
        "}";
    }
}
