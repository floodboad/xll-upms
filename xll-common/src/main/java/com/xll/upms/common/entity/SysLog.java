package com.xll.upms.common.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 徐亮亮
 * @Description： 日志表实体类
 * @Date 2019/1/18 20:51
 */
@Data
@TableName("sys_log_0")
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(type = IdType.ID_WORKER)
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    /**
     * 日志类型
     */
    private String type;
    /**
     * 日志标题
     */
    private String title;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 操作IP地址
     */
    private String remoteAddr;
    /**
     * 用户代理
     */
    private String userAgent;
    /**
     * 请求URI
     */
    private String requestUri;
    /**
     * 操作方式
     */
    private String method;
    /**
     * 操作提交的数据
     */
    private String params;
    /**
     * 执行时间
     */
    private Long time;

    /**
     * 删除标记
     */
    private String delFlag;

    /**
     * 异常信息
     */
    private String exception;

    /**
     * 服务ID
     */
    private String serviceId;


    @Override
    public String toString() {
        return "SysLog{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", remoteAddr='" + remoteAddr + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", requestUri='" + requestUri + '\'' +
                ", method='" + method + '\'' +
                ", params='" + params + '\'' +
                ", time=" + time +
                ", delFlag='" + delFlag + '\'' +
                ", exception='" + exception + '\'' +
                '}';
    }
}
