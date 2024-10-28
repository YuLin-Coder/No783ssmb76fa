package com.entity.model;

import com.entity.WudaokaojiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 舞蹈考级
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public class WudaokaojiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 考级信息
	 */
	
	private String kaojixinxi;
		
	/**
	 * 报考时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
