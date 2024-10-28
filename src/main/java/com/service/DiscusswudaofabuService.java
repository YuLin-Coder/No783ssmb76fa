package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswudaofabuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswudaofabuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswudaofabuView;


/**
 * 舞蹈发布评论表
 *
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface DiscusswudaofabuService extends IService<DiscusswudaofabuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswudaofabuVO> selectListVO(Wrapper<DiscusswudaofabuEntity> wrapper);
   	
   	DiscusswudaofabuVO selectVO(@Param("ew") Wrapper<DiscusswudaofabuEntity> wrapper);
   	
   	List<DiscusswudaofabuView> selectListView(Wrapper<DiscusswudaofabuEntity> wrapper);
   	
   	DiscusswudaofabuView selectView(@Param("ew") Wrapper<DiscusswudaofabuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswudaofabuEntity> wrapper);
   	
}

