package com.entity.view;

import com.entity.YonghufenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户分享
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
@TableName("yonghufenxiang")
public class YonghufenxiangView  extends YonghufenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghufenxiangView(){
	}
 
 	public YonghufenxiangView(YonghufenxiangEntity yonghufenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, yonghufenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
