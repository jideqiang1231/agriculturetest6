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
public class Specialist implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "specialist_id", type = IdType.AUTO)
    private Integer specialistId;

    private String specialistName;

    private String specialistPhone;

    private String specialistAddress;

    private String specialistInstructions;

    private String specialistType;


    public Integer getSpecialistId() {
        return specialistId;
    }

    public void setSpecialistId(Integer specialistId) {
        this.specialistId = specialistId;
    }

    public String getSpecialistName() {
        return specialistName;
    }

    public void setSpecialistName(String specialistName) {
        this.specialistName = specialistName;
    }

    public String getSpecialistPhone() {
        return specialistPhone;
    }

    public void setSpecialistPhone(String specialistPhone) {
        this.specialistPhone = specialistPhone;
    }

    public String getSpecialistAddress() {
        return specialistAddress;
    }

    public void setSpecialistAddress(String specialistAddress) {
        this.specialistAddress = specialistAddress;
    }

    public String getSpecialistInstructions() {
        return specialistInstructions;
    }

    public void setSpecialistInstructions(String specialistInstructions) {
        this.specialistInstructions = specialistInstructions;
    }

    public String getSpecialistType() {
        return specialistType;
    }

    public void setSpecialistType(String specialistType) {
        this.specialistType = specialistType;
    }

    @Override
    public String toString() {
        return "Specialist{" +
        "specialistId=" + specialistId +
        ", specialistName=" + specialistName +
        ", specialistPhone=" + specialistPhone +
        ", specialistAddress=" + specialistAddress +
        ", specialistInstructions=" + specialistInstructions +
        ", specialistType=" + specialistType +
        "}";
    }
}
