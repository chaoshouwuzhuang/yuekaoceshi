package com.mmcro.cms.service;

import java.util.List;

import com.mmcro.cms.entity.Category;

public interface CategoryService {

	List<Category> getCategoryByChId(Integer cid);

}
