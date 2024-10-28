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
 * 用户分享
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
@TableName("yonghufenxiang")
public class YonghufenxiangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonghufenxiangEntity() {
		
	}
	
	public YonghufenxiangEntity(T t) {
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
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 舞蹈标题
	 */
					
	private String wudaobiaoti;
	
	/**
	 * 舞种图片
	 */
					
	private String wuzhongtupian;
	
	/**
	 * 舞蹈等级
	 */
					
	private String wudaodengji;
	
	/**
	 * 视频
	 */
					
	private String shipin;
	
	/**
	 * 舞蹈介绍
	 */
					
	private String wudaojieshao;
	
	/**
	 * 舞蹈分析
	 */
					
	private String wudaofenxi;
	
	/**
	 * 咨询
	 */
					
	private String zixun;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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
	 * 设置：舞蹈标题
	 */
	public void setWudaobiaoti(String wudaobiaoti) {
		this.wudaobiaoti = wudaobiaoti;
	}
	/**
	 * 获取：舞蹈标题
	 */
	public String getWudaobiaoti() {
		return wudaobiaoti;
	}
	/**
	 * 设置：舞种图片
	 */
	public void setWuzhongtupian(String wuzhongtupian) {
		this.wuzhongtupian = wuzhongtupian;
	}
	/**
	 * 获取：舞种图片
	 */
	public String getWuzhongtupian() {
		return wuzhongtupian;
	}
	/**
	 * 设置：舞蹈等级
	 */
	public void setWudaodengji(String wudaodengji) {
		this.wudaodengji = wudaodengji;
	}
	/**
	 * 获取：舞蹈等级
	 */
	public String getWudaodengji() {
		return wudaodengji;
	}
	/**
	 * 设置：视频
	 */
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
	/**
	 * 设置：舞蹈介绍
	 */
	public void setWudaojieshao(String wudaojieshao) {
		this.wudaojieshao = wudaojieshao;
	}
	/**
	 * 获取：舞蹈介绍
	 */
	public String getWudaojieshao() {
		return wudaojieshao;
	}
	/**
	 * 设置：舞蹈分析
	 */
	public void setWudaofenxi(String wudaofenxi) {
		this.wudaofenxi = wudaofenxi;
	}
	/**
	 * 获取：舞蹈分析
	 */
	public String getWudaofenxi() {
		return wudaofenxi;
	}
	/**
	 * 设置：咨询
	 */
	public void setZixun(String zixun) {
		this.zixun = zixun;
	}
	/**
	 * 获取：咨询
	 */
	public String getZixun() {
		return zixun;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}
