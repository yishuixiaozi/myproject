package com.hhit.dao;
import com.hhit.model.Dept;
import java.util.List;
public interface DeptDao {
    List<Dept> deptSearchall();//查询所用用户表信息

    void deletedept(int id);

    void adddept(Dept dept);

    void updatedept(Dept dept);
}
