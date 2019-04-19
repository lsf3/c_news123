package cn.kgc;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.kgc.dao.NewsDao;
import cn.kgc.entities.News;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProviderTest {
	@Autowired
	private NewsDao dao;

	@Test
	public void test(){
		News param = new News();
		param.setTitle("出");
		List<News> list = dao.getNews(param);
		System.out.println(list);
	}
}
