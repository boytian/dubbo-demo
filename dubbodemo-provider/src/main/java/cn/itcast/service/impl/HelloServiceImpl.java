package cn.itcast.service.impl;

import cn.itcast.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;


/**
 * 需要暴露一个dubbo的服务，需要被消费者调用
 * @Service ： 配置到service实现类上
 *          ： 向dubbo暴露一个服务，可以被消费者调用
 *          ： Hello服务，一个服务，可以提供若干个功能（方法）
 *
 */
@Service
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        System.out.println("传入的用户名name="+name);
        return "hello : "+ name;
    }
}