package com.myproject.mappers;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: javaio
 * @description:
 * @author: CuiZhen
 * @create: 2020-07-22 11:24
 **/
@Repository
public interface TestMapper {
  List<Map> getUserInfo();
}
