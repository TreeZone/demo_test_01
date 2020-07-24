package com.myproject.controller;

import com.alibaba.fastjson.JSONObject;
import com.myproject.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @program: javaio
 * @description:
 * @author: CuiZhen
 * @create: 2020-07-22 11:14
 **/
@RestController
@Slf4j
public class TestController {
  @Resource
  TestService testService;

  @RequestMapping("queryUserInfo")
  public List<Map> queryUserInfo() {
    List<Map> user = testService.getUser();
    log.info("heiheihei_________{}", JSONObject.toJSONString(user));
    return testService.getUser();
  }
}
