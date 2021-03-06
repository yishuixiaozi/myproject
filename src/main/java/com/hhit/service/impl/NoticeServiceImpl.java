package com.hhit.service.impl;

import com.hhit.dao.NoticeDao;
import com.hhit.model.Notice;
import com.hhit.service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="noticeservice")
public class NoticeServiceImpl implements NoticeService {
    @Resource
    NoticeDao noticeDao;
    @Override
    public List<Notice> noticeSearchall() {
        return noticeDao.noticeSearchall();
    }

    @Override
    public void deletenotice(int id) {
        noticeDao.deletenotice(id);
    }

    @Override
    public void addnotice(Notice notice) {
        noticeDao.addnotice(notice);
    }
}
