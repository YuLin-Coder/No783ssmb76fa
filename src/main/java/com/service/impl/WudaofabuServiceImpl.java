package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WudaofabuDao;
import com.entity.WudaofabuEntity;
import com.service.WudaofabuService;
import com.entity.vo.WudaofabuVO;
import com.entity.view.WudaofabuView;

@Service("wudaofabuService")
public class WudaofabuServiceImpl extends ServiceImpl<WudaofabuDao, WudaofabuEntity> implements WudaofabuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WudaofabuEntity> page = this.selectPage(
                new Query<WudaofabuEntity>(params).getPage(),
                new EntityWrapper<WudaofabuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WudaofabuEntity> wrapper) {
		  Page<WudaofabuView> page =new Query<WudaofabuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WudaofabuVO> selectListVO(Wrapper<WudaofabuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WudaofabuVO selectVO(Wrapper<WudaofabuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WudaofabuView> selectListView(Wrapper<WudaofabuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WudaofabuView selectView(Wrapper<WudaofabuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
