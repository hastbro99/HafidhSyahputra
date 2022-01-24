package com.sinaucoding.perpustakaan.service;

import com.sinaucoding.perpustakaan.dao.BaseDAO;
import com.sinaucoding.perpustakaan.dao.UserDAO;
import com.sinaucoding.perpustakaan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {
    @Autowired
    private UserDAO dao;

    @Override
    protected BaseDAO<User> getDAO() {
        return dao;
    }
}
