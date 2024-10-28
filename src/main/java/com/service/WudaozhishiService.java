package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WudaozhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WudaozhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WudaozhishiView;


/**
 * 舞蹈知识
 *
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface WudaozhishiService extends IService<WudaozhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WudaozhishiVO> selectListVO(Wrapper<WudaozhishiEntity> wrapper);
   	
   	WudaozhishiVO selectVO(@Param("ew") Wrapper<WudaozhishiEntity> wrapper);
   	
   	List<WudaozhishiView> selectListView(Wrapper<WudaozhishiEntity> wrapper);
   	
   	WudaozhishiView selectView(@Param("ew") Wrapper<WudaozhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WudaozhishiEntity> wrapper);
   	
}

