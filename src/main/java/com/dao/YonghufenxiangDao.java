package com.dao;

import com.entity.YonghufenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghufenxiangVO;
import com.entity.view.YonghufenxiangView;


/**
 * 用户分享
 * 
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface YonghufenxiangDao extends BaseMapper<YonghufenxiangEntity> {
	
	List<YonghufenxiangVO> selectListVO(@Param("ew") Wrapper<YonghufenxiangEntity> wrapper);
	
	YonghufenxiangVO selectVO(@Param("ew") Wrapper<YonghufenxiangEntity> wrapper);
	
	List<YonghufenxiangView> selectListView(@Param("ew") Wrapper<YonghufenxiangEntity> wrapper);

	List<YonghufenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<YonghufenxiangEntity> wrapper);
	
	YonghufenxiangView selectView(@Param("ew") Wrapper<YonghufenxiangEntity> wrapper);
	
}
