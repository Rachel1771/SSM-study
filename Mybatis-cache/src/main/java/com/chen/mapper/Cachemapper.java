package com.chen.mapper;

import com.chen.pojo.dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author Rachel
 * @date 2022/7/29 0:56
 * @desciption: 接口
 * @status 嗯嗯
 */
public interface Cachemapper {
    dept getDeptno(@Param("Deptno") Integer Deptno);
}
