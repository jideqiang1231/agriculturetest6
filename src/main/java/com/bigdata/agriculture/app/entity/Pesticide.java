package com.bigdata.agriculture.app.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jdq
 * @since 2020-03-14
 */
public class Pesticide implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "pesticide_id", type = IdType.AUTO)
    private Integer pesticideId;

    private String pesticideName;

    private String pesticideComposition;

    private String pesticideDosage;

    private String pesticideContent;

    private String pesticidePredisease;

    private String pesticideInstructions;

    private Double pesticidePrice;

    private String pesticideManufacturer;

    private String pesticideLicensenumber;

    private String pesticideAddress;

    private LocalDate pesticideProductiondate;

    private String pesticideCrop;

    private String pesticideVirulence;

    private String pesticideNote;

    private String pesticidePhone;

    @TableField("pesticide_Shelflife")
    private LocalDate pesticideShelflife;


    public Integer getPesticideId() {
        return pesticideId;
    }

    public void setPesticideId(Integer pesticideId) {
        this.pesticideId = pesticideId;
    }

    public String getPesticideName() {
        return pesticideName;
    }

    public void setPesticideName(String pesticideName) {
        this.pesticideName = pesticideName;
    }

    public String getPesticideComposition() {
        return pesticideComposition;
    }

    public void setPesticideComposition(String pesticideComposition) {
        this.pesticideComposition = pesticideComposition;
    }

    public String getPesticideDosage() {
        return pesticideDosage;
    }

    public void setPesticideDosage(String pesticideDosage) {
        this.pesticideDosage = pesticideDosage;
    }

    public String getPesticideContent() {
        return pesticideContent;
    }

    public void setPesticideContent(String pesticideContent) {
        this.pesticideContent = pesticideContent;
    }

    public String getPesticidePredisease() {
        return pesticidePredisease;
    }

    public void setPesticidePredisease(String pesticidePredisease) {
        this.pesticidePredisease = pesticidePredisease;
    }

    public String getPesticideInstructions() {
        return pesticideInstructions;
    }

    public void setPesticideInstructions(String pesticideInstructions) {
        this.pesticideInstructions = pesticideInstructions;
    }

    public Double getPesticidePrice() {
        return pesticidePrice;
    }

    public void setPesticidePrice(Double pesticidePrice) {
        this.pesticidePrice = pesticidePrice;
    }

    public String getPesticideManufacturer() {
        return pesticideManufacturer;
    }

    public void setPesticideManufacturer(String pesticideManufacturer) {
        this.pesticideManufacturer = pesticideManufacturer;
    }

    public String getPesticideLicensenumber() {
        return pesticideLicensenumber;
    }

    public void setPesticideLicensenumber(String pesticideLicensenumber) {
        this.pesticideLicensenumber = pesticideLicensenumber;
    }

    public String getPesticideAddress() {
        return pesticideAddress;
    }

    public void setPesticideAddress(String pesticideAddress) {
        this.pesticideAddress = pesticideAddress;
    }

    public LocalDate getPesticideProductiondate() {
        return pesticideProductiondate;
    }

    public void setPesticideProductiondate(LocalDate pesticideProductiondate) {
        this.pesticideProductiondate = pesticideProductiondate;
    }

    public String getPesticideCrop() {
        return pesticideCrop;
    }

    public void setPesticideCrop(String pesticideCrop) {
        this.pesticideCrop = pesticideCrop;
    }

    public String getPesticideVirulence() {
        return pesticideVirulence;
    }

    public void setPesticideVirulence(String pesticideVirulence) {
        this.pesticideVirulence = pesticideVirulence;
    }

    public String getPesticideNote() {
        return pesticideNote;
    }

    public void setPesticideNote(String pesticideNote) {
        this.pesticideNote = pesticideNote;
    }

    public String getPesticidePhone() {
        return pesticidePhone;
    }

    public void setPesticidePhone(String pesticidePhone) {
        this.pesticidePhone = pesticidePhone;
    }

    public LocalDate getPesticideShelflife() {
        return pesticideShelflife;
    }

    public void setPesticideShelflife(LocalDate pesticideShelflife) {
        this.pesticideShelflife = pesticideShelflife;
    }

    @Override
    public String toString() {
        return "Pesticide{" +
        "pesticideId=" + pesticideId +
        ", pesticideName=" + pesticideName +
        ", pesticideComposition=" + pesticideComposition +
        ", pesticideDosage=" + pesticideDosage +
        ", pesticideContent=" + pesticideContent +
        ", pesticidePredisease=" + pesticidePredisease +
        ", pesticideInstructions=" + pesticideInstructions +
        ", pesticidePrice=" + pesticidePrice +
        ", pesticideManufacturer=" + pesticideManufacturer +
        ", pesticideLicensenumber=" + pesticideLicensenumber +
        ", pesticideAddress=" + pesticideAddress +
        ", pesticideProductiondate=" + pesticideProductiondate +
        ", pesticideCrop=" + pesticideCrop +
        ", pesticideVirulence=" + pesticideVirulence +
        ", pesticideNote=" + pesticideNote +
        ", pesticidePhone=" + pesticidePhone +
        ", pesticideShelflife=" + pesticideShelflife +
        "}";
    }
}
