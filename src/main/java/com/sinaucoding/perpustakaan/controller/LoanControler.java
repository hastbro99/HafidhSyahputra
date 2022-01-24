package com.sinaucoding.perpustakaan.controller;

import com.sinaucoding.perpustakaan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("loans")
@RestController
public class LoanControler extends BaseController {
    @Autowired
    private LoanService service;
}
