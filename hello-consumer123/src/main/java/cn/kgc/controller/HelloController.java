package cn.kgc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.kgc.service.RpcHelloService;

@RestController
public class HelloController {

	@Reference
	private RpcHelloService rhs;
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name){
		return rhs.sayHello(name);
	}
}
