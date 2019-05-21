package com.crk.gril.service.impl;

import com.crk.gril.dao.ReportDao;
import com.crk.gril.domain.DataBaseFormat;
import com.crk.gril.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: 程荣凯
 * @Date: 2018/8/25 15:28
 */
@Service
public class ReportServiceImpl implements ReportService {
//    @Autowired
//    ReportDao reportDao;
    @Override
    public List<DataBaseFormat> getDataBase() {
//        List<HashMap<String,Object>> data = reportDao.getDataBase();
        return null;
    }
}
