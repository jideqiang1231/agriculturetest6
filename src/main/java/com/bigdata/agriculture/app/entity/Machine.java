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
public class Machine implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "machine_id", type = IdType.AUTO)
    private Integer machineId;

    private String machineName;

    private String machineFunction;

    private String machineManufacturer;

    private String machinePhone;

    private Double machinePrice;

    private String machineAddress;

    private String machineType;


    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getMachineFunction() {
        return machineFunction;
    }

    public void setMachineFunction(String machineFunction) {
        this.machineFunction = machineFunction;
    }

    public String getMachineManufacturer() {
        return machineManufacturer;
    }

    public void setMachineManufacturer(String machineManufacturer) {
        this.machineManufacturer = machineManufacturer;
    }

    public String getMachinePhone() {
        return machinePhone;
    }

    public void setMachinePhone(String machinePhone) {
        this.machinePhone = machinePhone;
    }

    public Double getMachinePrice() {
        return machinePrice;
    }

    public void setMachinePrice(Double machinePrice) {
        this.machinePrice = machinePrice;
    }

    public String getMachineAddress() {
        return machineAddress;
    }

    public void setMachineAddress(String machineAddress) {
        this.machineAddress = machineAddress;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    @Override
    public String toString() {
        return "Machine{" +
        "machineId=" + machineId +
        ", machineName=" + machineName +
        ", machineFunction=" + machineFunction +
        ", machineManufacturer=" + machineManufacturer +
        ", machinePhone=" + machinePhone +
        ", machinePrice=" + machinePrice +
        ", machineAddress=" + machineAddress +
        ", machineType=" + machineType +
        "}";
    }
}
