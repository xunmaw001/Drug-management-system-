package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 报损申报
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-12 19:05:57
 */
@TableName("baosunshenbao")
public class BaosunshenbaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaosunshenbaoEntity() {
		
	}
	
	public BaosunshenbaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 药品编号
	 */
					
	private String yaopinbianhao;
	
	/**
	 * 药品名称
	 */
					
	private String yaopinmingcheng;
	
	/**
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 报损时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date baosunshijian;
	
	/**
	 * 报损数量
	 */
					
	private Integer baosunshuliang;
	
	/**
	 * 原因说明
	 */
					
	private String yuanyinshuoming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：药品编号
	 */
	public void setYaopinbianhao(String yaopinbianhao) {
		this.yaopinbianhao = yaopinbianhao;
	}
	/**
	 * 获取：药品编号
	 */
	public String getYaopinbianhao() {
		return yaopinbianhao;
	}
	/**
	 * 设置：药品名称
	 */
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
	/**
	 * 设置：品牌
	 */
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
	/**
	 * 设置：报损时间
	 */
	public void setBaosunshijian(Date baosunshijian) {
		this.baosunshijian = baosunshijian;
	}
	/**
	 * 获取：报损时间
	 */
	public Date getBaosunshijian() {
		return baosunshijian;
	}
	/**
	 * 设置：报损数量
	 */
	public void setBaosunshuliang(Integer baosunshuliang) {
		this.baosunshuliang = baosunshuliang;
	}
	/**
	 * 获取：报损数量
	 */
	public Integer getBaosunshuliang() {
		return baosunshuliang;
	}
	/**
	 * 设置：原因说明
	 */
	public void setYuanyinshuoming(String yuanyinshuoming) {
		this.yuanyinshuoming = yuanyinshuoming;
	}
	/**
	 * 获取：原因说明
	 */
	public String getYuanyinshuoming() {
		return yuanyinshuoming;
	}

}
