package com.crk.gril.respository;

import com.crk.gril.domain.Gril;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GrilRespository extends JpaRepository<Gril,Integer> {
    //通过年龄查询女生列表
    public List<Gril> findByAge(Integer age);
}
