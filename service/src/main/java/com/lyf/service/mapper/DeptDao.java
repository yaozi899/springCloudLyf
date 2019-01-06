package com.lyf.service.mapper;

import com.lyf.base.vo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by LYF on 2018/10/23.
 */
@Mapper
@Component
public interface DeptDao
{
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}