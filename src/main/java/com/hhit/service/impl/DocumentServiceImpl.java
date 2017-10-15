package com.hhit.service.impl;

import com.hhit.dao.DocumentDao;
import com.hhit.model.Document;
import com.hhit.service.DocumentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="documentService")
public class DocumentServiceImpl implements DocumentService {

    @Resource
    DocumentDao documentDao;
    @Override
    public void addDocument(Document document) {
        documentDao.addDocument(document);
    }

    @Override
    public List<Document> documentSearchall() {
        return documentDao.documentSearchall();
    }
}
