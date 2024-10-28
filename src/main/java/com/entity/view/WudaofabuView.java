package com.entity.view;

import com.entity.WudaofabuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 舞蹈发布
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
@TableName("wudaofabu")
public class WudaofabuView  extends WudaofabuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WudaofabuView(){
	}
 
 	public WudaofabuView(WudaofabuEntity wudaofabuEntity){
 	try {
			BeanUtils.copyProperties(this, wudaofabuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
