package com.springboot.demo;

import com.springboot.demo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

/**
 * 2018/5/8.
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private JedisCluster jedisCluster;

    @Autowired
    private UserService userService;

    @Value("${book.name}")
    private String a;

    @RequestMapping("/hello/{id}")
    public String hello(@PathVariable("id") int id) throws InterruptedException {
       // Thread.sleep(10000);
      /*  String a = userService.getName(id);
        System.out.print(a);
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello,host:"+instance.getHost()+"serviceId = "+instance.getServiceId());
        jedisCluster.set("asasa","sasasasasasas");
        logger.info(jedisCluster.get("asasa"));
        jedisCluster.del("asasa");
        jedisCluster.set("a","b");*/
        return "Hello Word";
    }
}
