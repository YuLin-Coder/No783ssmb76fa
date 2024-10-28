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


import com.dao.DiscussyonghufenxiangDao;
import com.entity.DiscussyonghufenxiangEntity;
import com.service.DiscussyonghufenxiangService;
import com.entity.vo.DiscussyonghufenxiangVO;
import com.entity.view.DiscussyonghufenxiangView;

@Service("discussyonghufenxiangService")
public class DiscussyonghufenxiangServiceImpl extends ServiceImpl<DiscussyonghufenxiangDao, DiscussyonghufenxiangEntity> implements DiscussyonghufenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyonghufenxiangEntity> page = this.selectPage(
                new Query<DiscussyonghufenxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussyonghufenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyonghufenxiangEntity> wrapper) {
		  Page<DiscussyonghufenxiangView> page =new Query<DiscussyonghufenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyonghufenxiangVO> selectListVO(Wrapper<DiscussyonghufenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyonghufenxiangVO selectVO(Wrapper<DiscussyonghufenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyonghufenxiangView> selectListView(Wrapper<DiscussyonghufenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyonghufenxiangView selectView(Wrapper<DiscussyonghufenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
