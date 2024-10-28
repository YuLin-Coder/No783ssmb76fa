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


import com.dao.WudaokaojiDao;
import com.entity.WudaokaojiEntity;
import com.service.WudaokaojiService;
import com.entity.vo.WudaokaojiVO;
import com.entity.view.WudaokaojiView;

@Service("wudaokaojiService")
public class WudaokaojiServiceImpl extends ServiceImpl<WudaokaojiDao, WudaokaojiEntity> implements WudaokaojiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WudaokaojiEntity> page = this.selectPage(
                new Query<WudaokaojiEntity>(params).getPage(),
                new EntityWrapper<WudaokaojiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WudaokaojiEntity> wrapper) {
		  Page<WudaokaojiView> page =new Query<WudaokaojiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WudaokaojiVO> selectListVO(Wrapper<WudaokaojiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WudaokaojiVO selectVO(Wrapper<WudaokaojiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WudaokaojiView> selectListView(Wrapper<WudaokaojiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WudaokaojiView selectView(Wrapper<WudaokaojiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
