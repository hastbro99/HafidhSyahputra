package com.sinaucoding.perpustakaan.service;

import com.sinaucoding.perpustakaan.dao.BaseDAO;
import com.sinaucoding.perpustakaan.dao.BookDAO;
import com.sinaucoding.perpustakaan.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService extends BaseService<Book> {
    @Autowired
    private BookDAO dao;

    @Override
    protected BaseDAO<Book> getDAO() {
        return dao;
    }
}
