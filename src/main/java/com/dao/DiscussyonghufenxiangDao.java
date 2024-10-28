package com.dao;

import com.entity.DiscussyonghufenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyonghufenxiangVO;
import com.entity.view.DiscussyonghufenxiangView;


/**
 * 用户分享评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface DiscussyonghufenxiangDao extends BaseMapper<DiscussyonghufenxiangEntity> {
	
	List<DiscussyonghufenxiangVO> selectListVO(@Param("ew") Wrapper<DiscussyonghufenxiangEntity> wrapper);
	
	DiscussyonghufenxiangVO selectVO(@Param("ew") Wrapper<DiscussyonghufenxiangEntity> wrapper);
	
	List<DiscussyonghufenxiangView> selectListView(@Param("ew") Wrapper<DiscussyonghufenxiangEntity> wrapper);

	List<DiscussyonghufenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyonghufenxiangEntity> wrapper);
	
	DiscussyonghufenxiangView selectView(@Param("ew") Wrapper<DiscussyonghufenxiangEntity> wrapper);
	
}
