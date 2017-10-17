package com.hhit.service;
import com.hhit.model.Dept;
import com.hhit.model.User;
import java.util.List;
public interface DeptService {
    //查询用户集合
    List<Dept> deptSearchall();

    void deletedept(int id);

    void adddept(Dept dept);

    void updatedept(Dept dept);
}
