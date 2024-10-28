package com.dao;

import com.entity.WudaokaojiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WudaokaojiVO;
import com.entity.view.WudaokaojiView;


/**
 * 舞蹈考级
 * 
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface WudaokaojiDao extends BaseMapper<WudaokaojiEntity> {
	
	List<WudaokaojiVO> selectListVO(@Param("ew") Wrapper<WudaokaojiEntity> wrapper);
	
	WudaokaojiVO selectVO(@Param("ew") Wrapper<WudaokaojiEntity> wrapper);
	
	List<WudaokaojiView> selectListView(@Param("ew") Wrapper<WudaokaojiEntity> wrapper);

	List<WudaokaojiView> selectListView(Pagination page,@Param("ew") Wrapper<WudaokaojiEntity> wrapper);
	
	WudaokaojiView selectView(@Param("ew") Wrapper<WudaokaojiEntity> wrapper);
	
}
