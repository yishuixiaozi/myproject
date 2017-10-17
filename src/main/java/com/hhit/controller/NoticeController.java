package com.hhit.controller;

import com.hhit.model.Notice;
import com.hhit.service.NoticeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value="/notice")
public class NoticeController {
    @Resource
    private NoticeService noticeService;

    /**
     * 全部信息的查询
     * @param modelMap
     * @return
     */
    @RequestMapping(value="/noticequery")
    public String noticequery(ModelMap modelMap){
        List<Notice> noticelist;
        noticelist=noticeService.noticeSearchall();
        modelMap.addAttribute("noticelist",noticelist);
        return "noticequery";
    }

    /**
     * 公告删除
     * @param request
     * @return
     */
    @RequestMapping(value="/deletenotice")
    public String deletenotice(HttpServletRequest request){
        int id=Integer.valueOf(request.getParameter("id"));
        noticeService.deletenotice(id);
        return "redirect:/notice/noticequery.action";
    }

    /**
     * 公告添加
     * @param notice
     * @param request
     * @return
     */
    @RequestMapping(value="/addnotice")
    public String addnotice(Notice notice,HttpServletRequest request){
        HttpSession session=request.getSession();
        int user_id=Integer.parseInt(String.valueOf(session.getAttribute("user_id")));
        notice.setUser_id(user_id);
        noticeService.addnotice(notice);
        return "redirect:/notice/noticequery.action";
    }
}
