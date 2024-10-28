package com.dao;

import com.entity.WudaofabuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WudaofabuVO;
import com.entity.view.WudaofabuView;


/**
 * 舞蹈发布
 * 
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface WudaofabuDao extends BaseMapper<WudaofabuEntity> {
	
	List<WudaofabuVO> selectListVO(@Param("ew") Wrapper<WudaofabuEntity> wrapper);
	
	WudaofabuVO selectVO(@Param("ew") Wrapper<WudaofabuEntity> wrapper);
	
	List<WudaofabuView> selectListView(@Param("ew") Wrapper<WudaofabuEntity> wrapper);

	List<WudaofabuView> selectListView(Pagination page,@Param("ew") Wrapper<WudaofabuEntity> wrapper);
	
	WudaofabuView selectView(@Param("ew") Wrapper<WudaofabuEntity> wrapper);
	
}
