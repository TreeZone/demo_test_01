package com.myproject.service;

import com.myproject.mappers.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @program: javaio
 * @description:
 * @author: CuiZhen
 * @create: 2020-07-22 11:21
 **/
@Service
public class TestService {
  @Resource
  TestMapper testMapper;
  public List<Map> getUser(){
    return testMapper.getUserInfo();
  }
}
