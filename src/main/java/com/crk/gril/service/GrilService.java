package com.crk.gril.service;

import com.crk.gril.domain.Gril;
import com.crk.gril.enums.ResultEnum;
import com.crk.gril.exception.GrilException;
import com.crk.gril.respository.GrilRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrilService {
    @Autowired
    private GrilRespository grilRespository;

    @org.springframework.transaction.annotation.Transactional
    public void insertTwo(){
        Gril grilA = new Gril();
        grilA.setAge(18);
        grilA.setCupSize("D");
        grilRespository.save(grilA);

        Gril grilB = new Gril();
        grilB.setAge(20);
        grilB.setCupSize("EEE");
        grilRespository.save(grilB);

    }

    public void getAge(Integer id) throws Exception {
        Gril gril = grilRespository.getOne(id);
        if (gril.getAge()<10){
            throw new GrilException(ResultEnum.PRIMARY_SCHOOL);
        }
        else if(10 <gril.getAge()&&gril.getAge()<16){
            throw new GrilException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    /**
     * 查询一个女生
     * @param id 编号
     * @return
     */
    public Gril findOne(Integer id){
        return  grilRespository.getOne(id);
    }
}
