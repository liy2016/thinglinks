package com.mqttsnet.thinglinks.link.api.domain.product.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**

* @Description:    java类作用描述
* @Author:         ShiHuan Sun
* @E-mail:         13733918655@163.com
* @Website:        http://thinglinks.mqttsnet.com
* @CreateDate:     2021/12/25$ 23:52$
* @UpdateUser:     ShiHuan Sun
* @UpdateDate:     2021/12/25$ 23:52$
* @UpdateRemark:   修改内容
* @Version:        1.0

*/
/**
    * 产品模型
    */
@ApiModel(value="产品模型")
@Data
public class Product implements Serializable {
    /**
    * id
    */
    @ApiModelProperty(value="id")
    private Long id;

    /**
    * 应用ID
    */
    @ApiModelProperty(value="应用ID")
    private String appId;

    /**
    * 产品模型模板
    */
    @ApiModelProperty(value="产品模型模板")
    private Long templateId;

    /**
    * 产品名称:自定义，支持中文、英文大小写、数字、下划线和中划线
    */
    @ApiModelProperty(value="产品名称:自定义，支持中文、英文大小写、数字、下划线和中划线")
    private String productName;

    /**
    * 产品标识
    */
    @ApiModelProperty(value="产品标识")
    private String productIdentification;

    /**
    * 支持以下两种产品类型•0：普通产品，需直连设备。
•1：网关产品，可挂载子设备。

    */
    @ApiModelProperty(value="支持以下两种产品类型•0：普通产品，需直连设备。,•1：网关产品，可挂载子设备。,")
    private String productType;

    /**
    * 厂商ID:支持英文大小写，数字，下划线和中划线
    */
    @ApiModelProperty(value="厂商ID:支持英文大小写，数字，下划线和中划线")
    private String manufacturerId;

    /**
    * 厂商名称 :支持中文、英文大小写、数字、下划线和中划线
    */
    @ApiModelProperty(value="厂商名称 :支持中文、英文大小写、数字、下划线和中划线")
    private String manufacturerName;

    /**
    * 产品型号，建议包含字母或数字来保证可扩展性。支持英文大小写、数字、下划线和中划线

    */
    @ApiModelProperty(value="产品型号，建议包含字母或数字来保证可扩展性。支持英文大小写、数字、下划线和中划线,")
    private String model;

    /**
    * 数据格式，默认为JSON无需修改。
    */
    @ApiModelProperty(value="数据格式，默认为JSON无需修改。")
    private String dataFormat;

    /**
    * 设备类型:支持英文大小写、数字、下划线和中划线

    */
    @ApiModelProperty(value="设备类型:支持英文大小写、数字、下划线和中划线,")
    private String deviceType;

    /**
    * 设备接入平台的协议类型，默认为MQTT无需修改。
 
    */
    @ApiModelProperty(value="设备接入平台的协议类型，默认为MQTT无需修改。, ")
    private String protocolType;

    /**
    * 状态(字典值：启用  停用)
    */
    @ApiModelProperty(value="状态(字典值：启用  停用)")
    private String status;

    /**
    * 产品描述
    */
    @ApiModelProperty(value="产品描述")
    private String remark;

    /**
    * 创建者
    */
    @ApiModelProperty(value="创建者")
    private String createBy;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createTime;

    /**
    * 更新者
    */
    @ApiModelProperty(value="更新者")
    private String updateBy;

    /**
    * 更新时间
    */
    @ApiModelProperty(value="更新时间")
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;
}