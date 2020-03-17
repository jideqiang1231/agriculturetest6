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
public class Seed implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 种子表的主键
     */
    @TableId(value = "seed_id", type = IdType.AUTO)
    private Integer seedId;

    private String seedName;

    private String seedIntroduce;

    private String seedPlantarea;

    private String seedMethod;

    private Double seedPrice;

    private String seedManufacturer;

    private String seedNote;

    private String seedStore;

    private String seedPhone;

    private LocalDate seedProductiondate;

    @TableField("Seed_shelflife")
    private LocalDate seedShelflife;

    private String seedPlantnumber;

    private String seedType;


    public Integer getSeedId() {
        return seedId;
    }

    public void setSeedId(Integer seedId) {
        this.seedId = seedId;
    }

    public String getSeedName() {
        return seedName;
    }

    public void setSeedName(String seedName) {
        this.seedName = seedName;
    }

    public String getSeedIntroduce() {
        return seedIntroduce;
    }

    public void setSeedIntroduce(String seedIntroduce) {
        this.seedIntroduce = seedIntroduce;
    }

    public String getSeedPlantarea() {
        return seedPlantarea;
    }

    public void setSeedPlantarea(String seedPlantarea) {
        this.seedPlantarea = seedPlantarea;
    }

    public String getSeedMethod() {
        return seedMethod;
    }

    public void setSeedMethod(String seedMethod) {
        this.seedMethod = seedMethod;
    }

    public Double getSeedPrice() {
        return seedPrice;
    }

    public void setSeedPrice(Double seedPrice) {
        this.seedPrice = seedPrice;
    }

    public String getSeedManufacturer() {
        return seedManufacturer;
    }

    public void setSeedManufacturer(String seedManufacturer) {
        this.seedManufacturer = seedManufacturer;
    }

    public String getSeedNote() {
        return seedNote;
    }

    public void setSeedNote(String seedNote) {
        this.seedNote = seedNote;
    }

    public String getSeedStore() {
        return seedStore;
    }

    public void setSeedStore(String seedStore) {
        this.seedStore = seedStore;
    }

    public String getSeedPhone() {
        return seedPhone;
    }

    public void setSeedPhone(String seedPhone) {
        this.seedPhone = seedPhone;
    }

    public LocalDate getSeedProductiondate() {
        return seedProductiondate;
    }

    public void setSeedProductiondate(LocalDate seedProductiondate) {
        this.seedProductiondate = seedProductiondate;
    }

    public LocalDate getSeedShelflife() {
        return seedShelflife;
    }

    public void setSeedShelflife(LocalDate seedShelflife) {
        this.seedShelflife = seedShelflife;
    }

    public String getSeedPlantnumber() {
        return seedPlantnumber;
    }

    public void setSeedPlantnumber(String seedPlantnumber) {
        this.seedPlantnumber = seedPlantnumber;
    }

    public String getSeedType() {
        return seedType;
    }

    public void setSeedType(String seedType) {
        this.seedType = seedType;
    }

    @Override
    public String toString() {
        return "Seed{" +
        "seedId=" + seedId +
        ", seedName=" + seedName +
        ", seedIntroduce=" + seedIntroduce +
        ", seedPlantarea=" + seedPlantarea +
        ", seedMethod=" + seedMethod +
        ", seedPrice=" + seedPrice +
        ", seedManufacturer=" + seedManufacturer +
        ", seedNote=" + seedNote +
        ", seedStore=" + seedStore +
        ", seedPhone=" + seedPhone +
        ", seedProductiondate=" + seedProductiondate +
        ", seedShelflife=" + seedShelflife +
        ", seedPlantnumber=" + seedPlantnumber +
        ", seedType=" + seedType +
        "}";
    }
}
