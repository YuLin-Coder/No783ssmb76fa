package com.dao;

import com.entity.DiscusswudaofabuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswudaofabuVO;
import com.entity.view.DiscusswudaofabuView;


/**
 * 舞蹈发布评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface DiscusswudaofabuDao extends BaseMapper<DiscusswudaofabuEntity> {
	
	List<DiscusswudaofabuVO> selectListVO(@Param("ew") Wrapper<DiscusswudaofabuEntity> wrapper);
	
	DiscusswudaofabuVO selectVO(@Param("ew") Wrapper<DiscusswudaofabuEntity> wrapper);
	
	List<DiscusswudaofabuView> selectListView(@Param("ew") Wrapper<DiscusswudaofabuEntity> wrapper);

	List<DiscusswudaofabuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswudaofabuEntity> wrapper);
	
	DiscusswudaofabuView selectView(@Param("ew") Wrapper<DiscusswudaofabuEntity> wrapper);
	
}
