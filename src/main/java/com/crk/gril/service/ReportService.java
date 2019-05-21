package com.crk.gril.service;

import com.crk.gril.domain.DataBaseFormat;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 程荣凯
 * @Date: 2018/8/25 15:28
 */
@Service
public  interface ReportService {
    List<DataBaseFormat> getDataBase();
}
