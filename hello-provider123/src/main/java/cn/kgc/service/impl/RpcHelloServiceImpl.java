package cn.kgc.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import cn.kgc.service.RpcHelloService;


@Service  // 暴露接口
@Component
public class RpcHelloServiceImpl implements RpcHelloService{
	@Override
	public String sayHello(String name) {
		return "hello " + name;
	}
}
