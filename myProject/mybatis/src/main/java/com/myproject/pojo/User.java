package com.myproject.pojo;

/**
 * @program: javaio
 * @description:
 * @author: CuiZhen
 * @create: 2020-07-22 14:56
 **/
public class User {
  private String id;
  private String name;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
  }
}
