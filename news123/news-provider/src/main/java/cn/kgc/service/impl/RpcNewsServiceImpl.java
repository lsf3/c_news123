package cn.kgc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import cn.kgc.dao.NewsDao;
import cn.kgc.entities.Category;
import cn.kgc.entities.News;
import cn.kgc.service.RpcNewsService;

@Service
@Component
public class RpcNewsServiceImpl implements RpcNewsService{
	@Autowired
	private NewsDao newDao;

	@Override
	public List<News> getNews(News param) {
		return newDao.getNews(param);
	}

	@Override
	public News getNewsById(Integer id) {
		return newDao.getNewsById(id);
	}

	@Override
	public void updateNews(News param) {
		newDao.updateNews(param);
	}

	@Override
	public List<Category> getAllCategory() {
		return newDao.getAllCategory();
	}

}
