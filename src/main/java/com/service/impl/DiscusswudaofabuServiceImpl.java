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


import com.dao.DiscusswudaofabuDao;
import com.entity.DiscusswudaofabuEntity;
import com.service.DiscusswudaofabuService;
import com.entity.vo.DiscusswudaofabuVO;
import com.entity.view.DiscusswudaofabuView;

@Service("discusswudaofabuService")
public class DiscusswudaofabuServiceImpl extends ServiceImpl<DiscusswudaofabuDao, DiscusswudaofabuEntity> implements DiscusswudaofabuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswudaofabuEntity> page = this.selectPage(
                new Query<DiscusswudaofabuEntity>(params).getPage(),
                new EntityWrapper<DiscusswudaofabuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswudaofabuEntity> wrapper) {
		  Page<DiscusswudaofabuView> page =new Query<DiscusswudaofabuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswudaofabuVO> selectListVO(Wrapper<DiscusswudaofabuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswudaofabuVO selectVO(Wrapper<DiscusswudaofabuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswudaofabuView> selectListView(Wrapper<DiscusswudaofabuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswudaofabuView selectView(Wrapper<DiscusswudaofabuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
