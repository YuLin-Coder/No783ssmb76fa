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


import com.dao.WudaozhishiDao;
import com.entity.WudaozhishiEntity;
import com.service.WudaozhishiService;
import com.entity.vo.WudaozhishiVO;
import com.entity.view.WudaozhishiView;

@Service("wudaozhishiService")
public class WudaozhishiServiceImpl extends ServiceImpl<WudaozhishiDao, WudaozhishiEntity> implements WudaozhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WudaozhishiEntity> page = this.selectPage(
                new Query<WudaozhishiEntity>(params).getPage(),
                new EntityWrapper<WudaozhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WudaozhishiEntity> wrapper) {
		  Page<WudaozhishiView> page =new Query<WudaozhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WudaozhishiVO> selectListVO(Wrapper<WudaozhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WudaozhishiVO selectVO(Wrapper<WudaozhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WudaozhishiView> selectListView(Wrapper<WudaozhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WudaozhishiView selectView(Wrapper<WudaozhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
