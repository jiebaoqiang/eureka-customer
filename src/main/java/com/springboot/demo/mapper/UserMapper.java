package com.springboot.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * 2018/7/6.
 */
@Mapper
public interface UserMapper {

    String getName(int id);
}
