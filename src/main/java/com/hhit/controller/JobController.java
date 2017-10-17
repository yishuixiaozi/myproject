package com.hhit.controller;
import com.hhit.model.Job;
import com.hhit.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value="/job")
public class JobController {

    @Resource
    private JobService jobserivce;

    /**
     * 职位信息的全部查询
     * @param modelMap
     * @return
     */
    @RequestMapping(value="/jobquery")
    public String jobsearch(ModelMap modelMap){
        List<Job> joblist;
        joblist=jobserivce.jobSearchall();
        modelMap.addAttribute("joblist",joblist);
        return "jobquery";
    }

    /**
     * 职位的删除
     * @param request
     * @return
     */
    @RequestMapping(value="/deletejob")
    public String jobdelete(HttpServletRequest request){
        int id=Integer.valueOf(request.getParameter("id"));
        jobserivce.deletejob(id);
        return "redirect:/job/jobquery.action";
    }

    @RequestMapping(value="/addjob")
    public String addjob(Job job){
        jobserivce.addjob(job);
        return "redirect:/job/jobquery.action";
    }
}
