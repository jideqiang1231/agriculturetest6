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
public class Information implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "information_id", type = IdType.AUTO)
    private Integer informationId;

    private String informationName;

    private Integer informationType;

    private LocalDate informationTime;

    private String informationContent;


    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public String getInformationName() {
        return informationName;
    }

    public void setInformationName(String informationName) {
        this.informationName = informationName;
    }

    public Integer getInformationType() {
        return informationType;
    }

    public void setInformationType(Integer informationType) {
        this.informationType = informationType;
    }

    public LocalDate getInformationTime() {
        return informationTime;
    }

    public void setInformationTime(LocalDate informationTime) {
        this.informationTime = informationTime;
    }

    public String getInformationContent() {
        return informationContent;
    }

    public void setInformationContent(String informationContent) {
        this.informationContent = informationContent;
    }

    @Override
    public String toString() {
        return "Information{" +
        "informationId=" + informationId +
        ", informationName=" + informationName +
        ", informationType=" + informationType +
        ", informationTime=" + informationTime +
        ", informationContent=" + informationContent +
        "}";
    }
}
