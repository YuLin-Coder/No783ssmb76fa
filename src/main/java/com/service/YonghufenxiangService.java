package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghufenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghufenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghufenxiangView;


/**
 * 用户分享
 *
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface YonghufenxiangService extends IService<YonghufenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghufenxiangVO> selectListVO(Wrapper<YonghufenxiangEntity> wrapper);
   	
   	YonghufenxiangVO selectVO(@Param("ew") Wrapper<YonghufenxiangEntity> wrapper);
   	
   	List<YonghufenxiangView> selectListView(Wrapper<YonghufenxiangEntity> wrapper);
   	
   	YonghufenxiangView selectView(@Param("ew") Wrapper<YonghufenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghufenxiangEntity> wrapper);
   	
}

