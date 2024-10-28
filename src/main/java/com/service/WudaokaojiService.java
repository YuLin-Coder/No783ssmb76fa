package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WudaokaojiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WudaokaojiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WudaokaojiView;


/**
 * 舞蹈考级
 *
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
public interface WudaokaojiService extends IService<WudaokaojiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WudaokaojiVO> selectListVO(Wrapper<WudaokaojiEntity> wrapper);
   	
   	WudaokaojiVO selectVO(@Param("ew") Wrapper<WudaokaojiEntity> wrapper);
   	
   	List<WudaokaojiView> selectListView(Wrapper<WudaokaojiEntity> wrapper);
   	
   	WudaokaojiView selectView(@Param("ew") Wrapper<WudaokaojiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WudaokaojiEntity> wrapper);
   	
}

