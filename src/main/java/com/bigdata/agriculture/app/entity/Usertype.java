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
public class Usertype implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "usertype_id", type = IdType.AUTO)
    private Integer usertypeId;

    private String usertypeName;

    /**
     * 1:表示系统管理员（信息审核及管理）
2:表示农业生产者（管理我的田接受推送信息，发布信息）
3:表示农业专家（发布，反馈，统计，指导）
4:表示供应商（销售及服务）
5.表示收购商（收购及统计）
6.表示农技推广员（发布，统计，计数）
     */
    private Integer usertypeType;


    public Integer getUsertypeId() {
        return usertypeId;
    }

    public void setUsertypeId(Integer usertypeId) {
        this.usertypeId = usertypeId;
    }

    public String getUsertypeName() {
        return usertypeName;
    }

    public void setUsertypeName(String usertypeName) {
        this.usertypeName = usertypeName;
    }

    public Integer getUsertypeType() {
        return usertypeType;
    }

    public void setUsertypeType(Integer usertypeType) {
        this.usertypeType = usertypeType;
    }

    @Override
    public String toString() {
        return "Usertype{" +
        "usertypeId=" + usertypeId +
        ", usertypeName=" + usertypeName +
        ", usertypeType=" + usertypeType +
        "}";
    }
}
