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


import com.dao.YonghufenxiangDao;
import com.entity.YonghufenxiangEntity;
import com.service.YonghufenxiangService;
import com.entity.vo.YonghufenxiangVO;
import com.entity.view.YonghufenxiangView;

@Service("yonghufenxiangService")
public class YonghufenxiangServiceImpl extends ServiceImpl<YonghufenxiangDao, YonghufenxiangEntity> implements YonghufenxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghufenxiangEntity> page = this.selectPage(
                new Query<YonghufenxiangEntity>(params).getPage(),
                new EntityWrapper<YonghufenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghufenxiangEntity> wrapper) {
		  Page<YonghufenxiangView> page =new Query<YonghufenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghufenxiangVO> selectListVO(Wrapper<YonghufenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghufenxiangVO selectVO(Wrapper<YonghufenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghufenxiangView> selectListView(Wrapper<YonghufenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghufenxiangView selectView(Wrapper<YonghufenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
