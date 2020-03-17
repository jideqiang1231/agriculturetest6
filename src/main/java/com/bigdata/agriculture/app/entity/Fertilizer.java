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
public class Fertilizer implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "fertilizer_id", type = IdType.AUTO)
    private Integer fertilizerId;

    private String fertilizerName;

    /**
     * 0表示无机肥，1代表有机肥
     */
    private Integer fertilizerType;

    private String fertilizerN;

    private String fertilizerP;

    private String fertilizerK;

    private String fertilizerOther;

    private String fertilizerInstructions;

    private Double fertilizerPrice;

    private String fertilizerManufacturer;

    private String fertilizerPhone;

    private String fertilizerAddress;

    private LocalDate fertilizerProductiondate;

    private LocalDate fertilizerShelflife;

    private String fertilizerModeratecrop;


    public Integer getFertilizerId() {
        return fertilizerId;
    }

    public void setFertilizerId(Integer fertilizerId) {
        this.fertilizerId = fertilizerId;
    }

    public String getFertilizerName() {
        return fertilizerName;
    }

    public void setFertilizerName(String fertilizerName) {
        this.fertilizerName = fertilizerName;
    }

    public Integer getFertilizerType() {
        return fertilizerType;
    }

    public void setFertilizerType(Integer fertilizerType) {
        this.fertilizerType = fertilizerType;
    }

    public String getFertilizerN() {
        return fertilizerN;
    }

    public void setFertilizerN(String fertilizerN) {
        this.fertilizerN = fertilizerN;
    }

    public String getFertilizerP() {
        return fertilizerP;
    }

    public void setFertilizerP(String fertilizerP) {
        this.fertilizerP = fertilizerP;
    }

    public String getFertilizerK() {
        return fertilizerK;
    }

    public void setFertilizerK(String fertilizerK) {
        this.fertilizerK = fertilizerK;
    }

    public String getFertilizerOther() {
        return fertilizerOther;
    }

    public void setFertilizerOther(String fertilizerOther) {
        this.fertilizerOther = fertilizerOther;
    }

    public String getFertilizerInstructions() {
        return fertilizerInstructions;
    }

    public void setFertilizerInstructions(String fertilizerInstructions) {
        this.fertilizerInstructions = fertilizerInstructions;
    }

    public Double getFertilizerPrice() {
        return fertilizerPrice;
    }

    public void setFertilizerPrice(Double fertilizerPrice) {
        this.fertilizerPrice = fertilizerPrice;
    }

    public String getFertilizerManufacturer() {
        return fertilizerManufacturer;
    }

    public void setFertilizerManufacturer(String fertilizerManufacturer) {
        this.fertilizerManufacturer = fertilizerManufacturer;
    }

    public String getFertilizerPhone() {
        return fertilizerPhone;
    }

    public void setFertilizerPhone(String fertilizerPhone) {
        this.fertilizerPhone = fertilizerPhone;
    }

    public String getFertilizerAddress() {
        return fertilizerAddress;
    }

    public void setFertilizerAddress(String fertilizerAddress) {
        this.fertilizerAddress = fertilizerAddress;
    }

    public LocalDate getFertilizerProductiondate() {
        return fertilizerProductiondate;
    }

    public void setFertilizerProductiondate(LocalDate fertilizerProductiondate) {
        this.fertilizerProductiondate = fertilizerProductiondate;
    }

    public LocalDate getFertilizerShelflife() {
        return fertilizerShelflife;
    }

    public void setFertilizerShelflife(LocalDate fertilizerShelflife) {
        this.fertilizerShelflife = fertilizerShelflife;
    }

    public String getFertilizerModeratecrop() {
        return fertilizerModeratecrop;
    }

    public void setFertilizerModeratecrop(String fertilizerModeratecrop) {
        this.fertilizerModeratecrop = fertilizerModeratecrop;
    }

    @Override
    public String toString() {
        return "Fertilizer{" +
        "fertilizerId=" + fertilizerId +
        ", fertilizerName=" + fertilizerName +
        ", fertilizerType=" + fertilizerType +
        ", fertilizerN=" + fertilizerN +
        ", fertilizerP=" + fertilizerP +
        ", fertilizerK=" + fertilizerK +
        ", fertilizerOther=" + fertilizerOther +
        ", fertilizerInstructions=" + fertilizerInstructions +
        ", fertilizerPrice=" + fertilizerPrice +
        ", fertilizerManufacturer=" + fertilizerManufacturer +
        ", fertilizerPhone=" + fertilizerPhone +
        ", fertilizerAddress=" + fertilizerAddress +
        ", fertilizerProductiondate=" + fertilizerProductiondate +
        ", fertilizerShelflife=" + fertilizerShelflife +
        ", fertilizerModeratecrop=" + fertilizerModeratecrop +
        "}";
    }
}
