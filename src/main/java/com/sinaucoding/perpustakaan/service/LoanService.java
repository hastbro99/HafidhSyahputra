package com.sinaucoding.perpustakaan.service;

import com.sinaucoding.perpustakaan.dao.BaseDAO;
import com.sinaucoding.perpustakaan.dao.LoanDAO;
import com.sinaucoding.perpustakaan.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService extends BaseService<Loan> {
    @Autowired
    private LoanDAO dao;

    @Override
    protected BaseDAO<Loan> getDAO() {
        return dao;
    }
}
