package com.entity.vo;

import com.entity.YonghufenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 用户分享
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public class YonghufenxiangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
