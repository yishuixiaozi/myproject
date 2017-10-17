package com.hhit.service;

import com.hhit.model.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> noticeSearchall();

    void deletenotice(int id);

    void addnotice(Notice notice);
}
