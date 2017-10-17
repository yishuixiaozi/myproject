package com.hhit.dao;
import com.hhit.model.Job;
import java.util.List;
public interface JobDao {
    List<Job> jobSearchall();

    void deletejob(int id);

    void addjob(Job job);

    void updatejob(Job job);
}
