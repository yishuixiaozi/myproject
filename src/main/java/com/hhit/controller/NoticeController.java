package com.hhit.controller;

import com.hhit.model.Notice;
import com.hhit.service.NoticeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value="/notice")
public class NoticeController {
    @Resource
    private NoticeService noticeService;

    @RequestMapping(value="/noticequery")
    public String noticequery(ModelMap modelMap){
        System.out.println("公告测试");
        List<Notice> noticelist;
        noticelist=noticeService.noticeSearchall();
        modelMap.addAttribute("noticelist",noticelist);
        return "noticequery";
    }
}
