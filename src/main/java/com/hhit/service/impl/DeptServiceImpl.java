package com.hhit.service.impl;

import com.hhit.dao.DeptDao;
import com.hhit.model.Dept;
import com.hhit.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value="deptservice")
public class DeptServiceImpl implements DeptService {

    @Resource
    DeptDao deptDao;
    @Override
    public List<Dept> deptSearchall() {
        return deptDao.deptSearchall();
    }

    @Override
    public void deletedept(int id) {
        deptDao.deletedept(id);
    }

    @Override
    public void adddept(Dept dept) {
        deptDao.adddept(dept);
    }
}
