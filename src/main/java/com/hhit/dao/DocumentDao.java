package com.hhit.dao;

import com.hhit.model.Document;

import java.util.List;

public interface DocumentDao {
    void addDocument(Document document);//文件上传与数据库配合值传递
    List<Document> documentSearchall();
    void deletedocument(int id);
}
