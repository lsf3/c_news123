package cn.kgc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.kgc.entities.Category;
import cn.kgc.entities.News;
import cn.kgc.service.RpcNewsService;

@Controller
public class NewsController {

	// 远程接口
	@Reference
	private RpcNewsService rns;
	
	// 查询新闻列表
	@GetMapping("/news")
	public String getNews(News param,Model model){
		List<News> newsList = rns.getNews(param);
		model.addAttribute("newsList", newsList);
		
		List<Category> categoryList = rns.getAllCategory();
		model.addAttribute("categoryList", categoryList);
		
		model.addAttribute("news", param);
		
		return "newsList";
	}
	
	// 根据Id查询新闻
	@GetMapping("/news/{id}")
	public String getNewsById(@PathVariable("id") Integer id,
			                  Model model){
		News news = rns.getNewsById(id);
		model.addAttribute("news", news);
		
		List<Category> categoryList = rns.getAllCategory();
		model.addAttribute("categoryList", categoryList);
		
		return "news";
	}
	
	// 修改提交
	@PutMapping("/news")
	public String updateNews(News param){
		rns.updateNews(param);
		return "redirect:/news";
	}
	
	
}





