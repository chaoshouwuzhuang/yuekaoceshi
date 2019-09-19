package com.mmcro.cms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.mmcro.cms.entity.Article;
import com.mmcro.cms.entity.Category;
import com.mmcro.cms.service.ArticleService;
import com.mmcro.cms.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	ArticleService articleService; 
	

	@Autowired
	private CategoryService  categoryService;  

	/**
	 * 根据频道的id 获取所有的分类
	 * @param cid
	 * @return
	 */
	@RequestMapping("getCategories")
	public String getCategoryByChId(HttpServletRequest request, Integer cid){
		
		
		List<Category> categoris = categoryService.getCategoryByChId(cid);
		System.out.println("categoris is" + categoris);
		
		// 获取这个频道下的所有的文章  
		PageInfo<Article> arPage =  articleService.list(1,cid, 0);
		request.setAttribute("pageInfo",arPage);
		
		request.setAttribute("catygories",categoris);
		request.setAttribute("channelId",cid);
		return "index/category";
		
		
		
	}
		
}
