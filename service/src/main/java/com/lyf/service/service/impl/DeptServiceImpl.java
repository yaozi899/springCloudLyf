package com.lyf.service.service.impl;

import com.lyf.base.vo.Dept;
import com.lyf.service.mapper.DeptDao;
import com.lyf.service.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LYF on 2018/10/23.
 */
@Service
public class DeptServiceImpl implements DeptService
{
    @Autowired
    private DeptDao dao ;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}

