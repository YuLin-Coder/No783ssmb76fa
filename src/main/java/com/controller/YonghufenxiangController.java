package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YonghufenxiangEntity;
import com.entity.view.YonghufenxiangView;

import com.service.YonghufenxiangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 用户分享
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
@RestController
@RequestMapping("/yonghufenxiang")
public class YonghufenxiangController {
    @Autowired
    private YonghufenxiangService yonghufenxiangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YonghufenxiangEntity yonghufenxiang, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yonghufenxiang.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YonghufenxiangEntity> ew = new EntityWrapper<YonghufenxiangEntity>();
		PageUtils page = yonghufenxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghufenxiang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YonghufenxiangEntity yonghufenxiang, HttpServletRequest request){
        EntityWrapper<YonghufenxiangEntity> ew = new EntityWrapper<YonghufenxiangEntity>();
		PageUtils page = yonghufenxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghufenxiang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YonghufenxiangEntity yonghufenxiang){
       	EntityWrapper<YonghufenxiangEntity> ew = new EntityWrapper<YonghufenxiangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yonghufenxiang, "yonghufenxiang")); 
        return R.ok().put("data", yonghufenxiangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YonghufenxiangEntity yonghufenxiang){
        EntityWrapper< YonghufenxiangEntity> ew = new EntityWrapper< YonghufenxiangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yonghufenxiang, "yonghufenxiang")); 
		YonghufenxiangView yonghufenxiangView =  yonghufenxiangService.selectView(ew);
		return R.ok("查询用户分享成功").put("data", yonghufenxiangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YonghufenxiangEntity yonghufenxiang = yonghufenxiangService.selectById(id);
        return R.ok().put("data", yonghufenxiang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YonghufenxiangEntity yonghufenxiang = yonghufenxiangService.selectById(id);
        return R.ok().put("data", yonghufenxiang);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        YonghufenxiangEntity yonghufenxiang = yonghufenxiangService.selectById(id);
        if(type.equals("1")) {
        	yonghufenxiang.setThumbsupnum(yonghufenxiang.getThumbsupnum()+1);
        } else {
        	yonghufenxiang.setCrazilynum(yonghufenxiang.getCrazilynum()+1);
        }
        yonghufenxiangService.updateById(yonghufenxiang);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YonghufenxiangEntity yonghufenxiang, HttpServletRequest request){
    	yonghufenxiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghufenxiang);

        yonghufenxiangService.insert(yonghufenxiang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YonghufenxiangEntity yonghufenxiang, HttpServletRequest request){
    	yonghufenxiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghufenxiang);

        yonghufenxiangService.insert(yonghufenxiang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YonghufenxiangEntity yonghufenxiang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yonghufenxiang);
        yonghufenxiangService.updateById(yonghufenxiang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yonghufenxiangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YonghufenxiangEntity> wrapper = new EntityWrapper<YonghufenxiangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yonghufenxiangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
