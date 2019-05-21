package com.crk.gril.controller;

import com.crk.gril.domain.DataBaseFormat;
import com.crk.gril.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 程荣凯
 * @Date: 2018/8/25 15:20
 */
@RestController
@RequestMapping("/report")
public class reportController {
    @Autowired
    ReportService reportService;
    @RequestMapping("/getDataBase.do")
    public List<DataBaseFormat> getDataBase(){
        List<DataBaseFormat> dbs = reportService.getDataBase();
        return dbs;
    }
}
