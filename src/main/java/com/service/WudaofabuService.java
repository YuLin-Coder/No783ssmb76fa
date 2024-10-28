package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WudaofabuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WudaofabuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WudaofabuView;


/**
 * 舞蹈发布
 *
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface WudaofabuService extends IService<WudaofabuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WudaofabuVO> selectListVO(Wrapper<WudaofabuEntity> wrapper);
   	
   	WudaofabuVO selectVO(@Param("ew") Wrapper<WudaofabuEntity> wrapper);
   	
   	List<WudaofabuView> selectListView(Wrapper<WudaofabuEntity> wrapper);
   	
   	WudaofabuView selectView(@Param("ew") Wrapper<WudaofabuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WudaofabuEntity> wrapper);
   	
}

