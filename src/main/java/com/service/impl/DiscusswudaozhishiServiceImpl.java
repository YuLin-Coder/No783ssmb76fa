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


import com.dao.DiscusswudaozhishiDao;
import com.entity.DiscusswudaozhishiEntity;
import com.service.DiscusswudaozhishiService;
import com.entity.vo.DiscusswudaozhishiVO;
import com.entity.view.DiscusswudaozhishiView;

@Service("discusswudaozhishiService")
public class DiscusswudaozhishiServiceImpl extends ServiceImpl<DiscusswudaozhishiDao, DiscusswudaozhishiEntity> implements DiscusswudaozhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswudaozhishiEntity> page = this.selectPage(
                new Query<DiscusswudaozhishiEntity>(params).getPage(),
                new EntityWrapper<DiscusswudaozhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswudaozhishiEntity> wrapper) {
		  Page<DiscusswudaozhishiView> page =new Query<DiscusswudaozhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswudaozhishiVO> selectListVO(Wrapper<DiscusswudaozhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswudaozhishiVO selectVO(Wrapper<DiscusswudaozhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswudaozhishiView> selectListView(Wrapper<DiscusswudaozhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswudaozhishiView selectView(Wrapper<DiscusswudaozhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
