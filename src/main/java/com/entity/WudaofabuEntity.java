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
 * 舞蹈发布
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
@TableName("wudaofabu")
public class WudaofabuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WudaofabuEntity() {
		
	}
	
	public WudaofabuEntity(T t) {
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
	 * 舞蹈名称
	 */
					
	private String wudaomingcheng;
	
	/**
	 * 舞蹈图片
	 */
					
	private String wudaotupian;
	
	/**
	 * 舞种
	 */
					
	private String wuzhong;
	
	/**
	 * 舞蹈视频
	 */
					
	private String wudaoshipin;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
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
	 * 设置：舞蹈名称
	 */
	public void setWudaomingcheng(String wudaomingcheng) {
		this.wudaomingcheng = wudaomingcheng;
	}
	/**
	 * 获取：舞蹈名称
	 */
	public String getWudaomingcheng() {
		return wudaomingcheng;
	}
	/**
	 * 设置：舞蹈图片
	 */
	public void setWudaotupian(String wudaotupian) {
		this.wudaotupian = wudaotupian;
	}
	/**
	 * 获取：舞蹈图片
	 */
	public String getWudaotupian() {
		return wudaotupian;
	}
	/**
	 * 设置：舞种
	 */
	public void setWuzhong(String wuzhong) {
		this.wuzhong = wuzhong;
	}
	/**
	 * 获取：舞种
	 */
	public String getWuzhong() {
		return wuzhong;
	}
	/**
	 * 设置：舞蹈视频
	 */
	public void setWudaoshipin(String wudaoshipin) {
		this.wudaoshipin = wudaoshipin;
	}
	/**
	 * 获取：舞蹈视频
	 */
	public String getWudaoshipin() {
		return wudaoshipin;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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
