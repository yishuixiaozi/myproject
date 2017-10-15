package com.hhit.service;

import com.hhit.model.Document;

import java.util.List;

public interface DocumentService {
    void addDocument(Document document);
    List<Document> documentSearchall();
}
