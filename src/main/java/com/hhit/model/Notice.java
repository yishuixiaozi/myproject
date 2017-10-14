package com.hhit.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Notice {
    private int id;
    private String title;
    private String content;
    private Date createDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //这个是从数据的date类型日期格式通过注解方式直接为数字类型
    //1、需要加载相应的包，joda-time 包，2、并且需要在页面内加上
    // <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    private Date create_date;
    //无参构造器
    public Notice(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
}

