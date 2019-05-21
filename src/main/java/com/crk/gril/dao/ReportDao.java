package com.crk.gril.dao;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: 程荣凯
 * @Date: 2018/8/25 15:38
 */
@Service
public interface ReportDao {
   List<HashMap<String,Object>> getDataBase();
}
