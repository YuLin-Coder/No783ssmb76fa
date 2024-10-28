package com.dao;

import com.entity.WudaozhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WudaozhishiVO;
import com.entity.view.WudaozhishiView;


/**
 * 舞蹈知识
 * 
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface WudaozhishiDao extends BaseMapper<WudaozhishiEntity> {
	
	List<WudaozhishiVO> selectListVO(@Param("ew") Wrapper<WudaozhishiEntity> wrapper);
	
	WudaozhishiVO selectVO(@Param("ew") Wrapper<WudaozhishiEntity> wrapper);
	
	List<WudaozhishiView> selectListView(@Param("ew") Wrapper<WudaozhishiEntity> wrapper);

	List<WudaozhishiView> selectListView(Pagination page,@Param("ew") Wrapper<WudaozhishiEntity> wrapper);
	
	WudaozhishiView selectView(@Param("ew") Wrapper<WudaozhishiEntity> wrapper);
	
}
