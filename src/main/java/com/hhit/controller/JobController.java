package com.hhit.controller;
import com.hhit.model.Job;
import com.hhit.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value="/job")
public class JobController {

    @Resource
    private JobService jobserivce;

    @RequestMapping(value="/jobquery")
    public String jobsearch(ModelMap modelMap){
        System.out.println("ceshi11111111111");
        List<Job> joblist;
        joblist=jobserivce.jobSearchall();
        modelMap.addAttribute("joblist",joblist);
        return "jobquery";
    }
}
