package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyonghufenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyonghufenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyonghufenxiangView;


/**
 * 用户分享评论表
 *
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface DiscussyonghufenxiangService extends IService<DiscussyonghufenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyonghufenxiangVO> selectListVO(Wrapper<DiscussyonghufenxiangEntity> wrapper);
   	
   	DiscussyonghufenxiangVO selectVO(@Param("ew") Wrapper<DiscussyonghufenxiangEntity> wrapper);
   	
   	List<DiscussyonghufenxiangView> selectListView(Wrapper<DiscussyonghufenxiangEntity> wrapper);
   	
   	DiscussyonghufenxiangView selectView(@Param("ew") Wrapper<DiscussyonghufenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyonghufenxiangEntity> wrapper);
   	
}

