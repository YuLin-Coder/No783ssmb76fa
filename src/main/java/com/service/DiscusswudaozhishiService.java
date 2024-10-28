package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswudaozhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswudaozhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswudaozhishiView;


/**
 * 舞蹈知识评论表
 *
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface DiscusswudaozhishiService extends IService<DiscusswudaozhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswudaozhishiVO> selectListVO(Wrapper<DiscusswudaozhishiEntity> wrapper);
   	
   	DiscusswudaozhishiVO selectVO(@Param("ew") Wrapper<DiscusswudaozhishiEntity> wrapper);
   	
   	List<DiscusswudaozhishiView> selectListView(Wrapper<DiscusswudaozhishiEntity> wrapper);
   	
   	DiscusswudaozhishiView selectView(@Param("ew") Wrapper<DiscusswudaozhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswudaozhishiEntity> wrapper);
   	
}

