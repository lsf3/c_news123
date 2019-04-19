package cn.kgc.service;


import java.util.List;

import cn.kgc.entities.Category;
import cn.kgc.entities.News;
// 远程接口定义
public interface RpcNewsService {
	// 根据条件查询
	public List<News> getNews(News param);
	// 根据id查询新闻
	public News getNewsById(Integer id);
	// 修改
	public void updateNews(News param);
	// 查询分类列表
	public List<Category> getAllCategory();
}
