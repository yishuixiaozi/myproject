package com.hhit.service.impl;

import com.hhit.dao.JobDao;
import com.hhit.model.Job;
import com.hhit.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value="jobservice")
public class JobServiceImpl implements JobService {

    //这个@Resource不能缺少，不然会导致空指针
    @Resource
    JobDao jobDao;
    @Override
    public List<Job> jobSearchall() {
        return jobDao.jobSearchall();
    }
}
