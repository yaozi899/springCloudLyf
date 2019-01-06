package com.lyf.service.service;


import com.lyf.base.vo.Dept;

import java.util.List;

/**
 * Created by LYF on 2018/10/23.
 */
public interface DeptService
{
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}
