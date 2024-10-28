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
 * 舞蹈考级
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
@TableName("wudaokaoji")
public class WudaokaojiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WudaokaojiEntity() {
		
	}
	
	public WudaokaojiEntity(T t) {
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
	 * 考级标题
	 */
					
	private String kaojibiaoti;
	
	/**
	 * 考级信息
	 */
					
	private String kaojixinxi;
	
	/**
	 * 报考时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date baokaoshijian;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 代理报名
	 */
					
	private String dailibaoming;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：考级标题
	 */
	public void setKaojibiaoti(String kaojibiaoti) {
		this.kaojibiaoti = kaojibiaoti;
	}
	/**
	 * 获取：考级标题
	 */
	public String getKaojibiaoti() {
		return kaojibiaoti;
	}
	/**
	 * 设置：考级信息
	 */
	public void setKaojixinxi(String kaojixinxi) {
		this.kaojixinxi = kaojixinxi;
	}
	/**
	 * 获取：考级信息
	 */
	public String getKaojixinxi() {
		return kaojixinxi;
	}
	/**
	 * 设置：报考时间
	 */
	public void setBaokaoshijian(Date baokaoshijian) {
		this.baokaoshijian = baokaoshijian;
	}
	/**
	 * 获取：报考时间
	 */
	public Date getBaokaoshijian() {
		return baokaoshijian;
	}
	/**
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
	/**
	 * 设置：代理报名
	 */
	public void setDailibaoming(String dailibaoming) {
		this.dailibaoming = dailibaoming;
	}
	/**
	 * 获取：代理报名
	 */
	public String getDailibaoming() {
		return dailibaoming;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
