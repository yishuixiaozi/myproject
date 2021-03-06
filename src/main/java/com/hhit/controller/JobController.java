package com.hhit.controller;
import com.hhit.model.Job;
import com.hhit.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    public String jobsearch(ModelMap modelMap,HttpServletRequest request){

        HttpSession session=request.getSession();
        String username=(String)session.getAttribute("username");
        System.out.println("岗位查询里边获取"+username);
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
    /**
     * 添加职位
     * @param job
     * @return
     */
    @RequestMapping(value="/addjob")
    public String addjob(Job job){
        jobserivce.addjob(job);
        return "redirect:/job/jobquery.action";
    }

    /**
     * 修改工作
     * @param job
     * @return
     */
    @RequestMapping(value="/updatejob")
    public String updatejob(Job job){
        jobserivce.update(job);
        return "redirect:/job/jobquery.action";
    }
}
