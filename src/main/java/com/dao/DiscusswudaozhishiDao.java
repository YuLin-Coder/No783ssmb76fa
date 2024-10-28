package com.dao;

import com.entity.DiscusswudaozhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswudaozhishiVO;
import com.entity.view.DiscusswudaozhishiView;


/**
 * 舞蹈知识评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface DiscusswudaozhishiDao extends BaseMapper<DiscusswudaozhishiEntity> {
	
	List<DiscusswudaozhishiVO> selectListVO(@Param("ew") Wrapper<DiscusswudaozhishiEntity> wrapper);
	
	DiscusswudaozhishiVO selectVO(@Param("ew") Wrapper<DiscusswudaozhishiEntity> wrapper);
	
	List<DiscusswudaozhishiView> selectListView(@Param("ew") Wrapper<DiscusswudaozhishiEntity> wrapper);

	List<DiscusswudaozhishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswudaozhishiEntity> wrapper);
	
	DiscusswudaozhishiView selectView(@Param("ew") Wrapper<DiscusswudaozhishiEntity> wrapper);
	
}
