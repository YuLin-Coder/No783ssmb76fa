package com.entity.vo;

import com.entity.WudaofabuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 舞蹈发布
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public class WudaofabuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
