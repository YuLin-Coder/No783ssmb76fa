package com.entity.view;

import com.entity.DiscusswudaofabuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 舞蹈发布评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
@TableName("discusswudaofabu")
public class DiscusswudaofabuView  extends DiscusswudaofabuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusswudaofabuView(){
	}
 
 	public DiscusswudaofabuView(DiscusswudaofabuEntity discusswudaofabuEntity){
 	try {
			BeanUtils.copyProperties(this, discusswudaofabuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
