package cn.itcast.controller;

import cn.itcast.service.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    /**
     * 通过dubbo，发起远程调用
     * 作为服务消费者，调用服务提供者
     */
    @Reference
    private HelloService helloService;

    @RequestMapping("/test")
    public @ResponseBody String test() {
        return helloService.sayHello("itcast");
    }
}