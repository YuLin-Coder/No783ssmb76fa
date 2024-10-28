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

import com.entity.WudaofabuEntity;
import com.entity.view.WudaofabuView;

import com.service.WudaofabuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 舞蹈发布
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-31 15:31:46
 */
@RestController
@RequestMapping("/wudaofabu")
public class WudaofabuController {
    @Autowired
    private WudaofabuService wudaofabuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WudaofabuEntity wudaofabu, 
		HttpServletRequest request){

        EntityWrapper<WudaofabuEntity> ew = new EntityWrapper<WudaofabuEntity>();
		PageUtils page = wudaofabuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wudaofabu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WudaofabuEntity wudaofabu, HttpServletRequest request){
        EntityWrapper<WudaofabuEntity> ew = new EntityWrapper<WudaofabuEntity>();
		PageUtils page = wudaofabuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wudaofabu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WudaofabuEntity wudaofabu){
       	EntityWrapper<WudaofabuEntity> ew = new EntityWrapper<WudaofabuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wudaofabu, "wudaofabu")); 
        return R.ok().put("data", wudaofabuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WudaofabuEntity wudaofabu){
        EntityWrapper< WudaofabuEntity> ew = new EntityWrapper< WudaofabuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wudaofabu, "wudaofabu")); 
		WudaofabuView wudaofabuView =  wudaofabuService.selectView(ew);
		return R.ok("查询舞蹈发布成功").put("data", wudaofabuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WudaofabuEntity wudaofabu = wudaofabuService.selectById(id);
		wudaofabu.setClicknum(wudaofabu.getClicknum()+1);
		wudaofabu.setClicktime(new Date());
		wudaofabuService.updateById(wudaofabu);
        return R.ok().put("data", wudaofabu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WudaofabuEntity wudaofabu = wudaofabuService.selectById(id);
		wudaofabu.setClicknum(wudaofabu.getClicknum()+1);
		wudaofabu.setClicktime(new Date());
		wudaofabuService.updateById(wudaofabu);
        return R.ok().put("data", wudaofabu);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        WudaofabuEntity wudaofabu = wudaofabuService.selectById(id);
        if(type.equals("1")) {
        	wudaofabu.setThumbsupnum(wudaofabu.getThumbsupnum()+1);
        } else {
        	wudaofabu.setCrazilynum(wudaofabu.getCrazilynum()+1);
        }
        wudaofabuService.updateById(wudaofabu);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WudaofabuEntity wudaofabu, HttpServletRequest request){
    	wudaofabu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wudaofabu);

        wudaofabuService.insert(wudaofabu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WudaofabuEntity wudaofabu, HttpServletRequest request){
    	wudaofabu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wudaofabu);

        wudaofabuService.insert(wudaofabu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WudaofabuEntity wudaofabu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wudaofabu);
        wudaofabuService.updateById(wudaofabu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wudaofabuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<WudaofabuEntity> wrapper = new EntityWrapper<WudaofabuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = wudaofabuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,WudaofabuEntity wudaofabu, HttpServletRequest request,String pre){
        EntityWrapper<WudaofabuEntity> ew = new EntityWrapper<WudaofabuEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = wudaofabuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wudaofabu), params), params));
        return R.ok().put("data", page);
    }


}
