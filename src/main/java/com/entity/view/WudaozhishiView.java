package com.entity.view;

import com.entity.WudaozhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 舞蹈知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
@TableName("wudaozhishi")
public class WudaozhishiView  extends WudaozhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WudaozhishiView(){
	}
 
 	public WudaozhishiView(WudaozhishiEntity wudaozhishiEntity){
 	try {
			BeanUtils.copyProperties(this, wudaozhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
