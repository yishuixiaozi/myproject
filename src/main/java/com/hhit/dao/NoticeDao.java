package com.hhit.dao;
import com.hhit.model.Notice;
import java.util.List;
public interface NoticeDao {
    List<Notice> noticeSearchall();

    void deletenotice(int id);

    void addnotice(Notice notice);
}
