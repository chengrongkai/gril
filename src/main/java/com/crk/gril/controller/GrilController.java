package com.crk.gril.controller;

import com.crk.gril.domain.Gril;
import com.crk.gril.domain.Result;
import com.crk.gril.respository.GrilRespository;
import com.crk.gril.service.GrilService;
import com.crk.gril.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
public class GrilController {
    @Autowired
    private GrilRespository grilRespository;
    @Autowired
    private GrilService grilService;

    private final Logger logger = LoggerFactory.getLogger(GrilController.class);
    /**
     * 查询女生列表
     * @return
     */
    @GetMapping(value = "/grils")
    public List<Gril> grilList(){
        return grilRespository.findAll();
    }

    /**
     * 新增一个女生信息
     * @param gril
     * @return
     */
    @PostMapping(value = "/grils")
    public Result<Gril> addGril (@Valid Gril gril, BindingResult bindingResult){
//        Gril gril = new Gril();
        if(bindingResult.hasErrors()){
//            logger.info(bindingResult.getFieldError().getDefaultMessage());
            return ResultUtil.failed(bindingResult.getFieldError().getDefaultMessage());
        }
        gril.setCupSize(gril.getCupSize());
        gril.setAge(gril.getAge());
        return ResultUtil.success(grilRespository.save(gril));
    }

    /**
     * 查找一个女生
     * @param id 编号
     * @return
     */
    @GetMapping(value ="/grils/{id}")
    public Gril GrilFindOne(@PathVariable("id") Integer id){
        return grilRespository.getOne(id);
    }

    /**
     * 更新一个女生信息
     * @param id
     * @param cupSize
     * @param age
     */
    @PostMapping(value = "/grils/{id}")
    public void GrilUpdate(@PathVariable("id") Integer id,@RequestParam(value = "cupSize") String cupSize,
                           @RequestParam(value = "age") Integer age){
            Gril gril = new Gril();
            gril.setId(id);
            gril.setCupSize(cupSize);
            gril.setAge(age);
            grilRespository.save(gril);
    }

    @DeleteMapping(value = "/grils/{id}")
    public void GrilDelete(@PathVariable("id") Integer id){
        grilRespository.deleteById(id);
    }

    @GetMapping(value = "/grils/age/{age}")
    public  List<Gril> GrilFindByAge(@PathVariable("age") Integer age){
        return grilRespository.findByAge(age);
    }

    @PostMapping(value = "/grils/two")
    public void insertTwoGril(){
        grilService.insertTwo();
    }
    @PostMapping(value = "/grils/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception {
        grilService.getAge(id);
    }
    @RequestMapping("/goList")
    public ModelAndView goList(@RequestParam Map<String,Object> map){
        ModelAndView modelAndView = new ModelAndView("/test.html");
        return modelAndView;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(@RequestBody Map<String,Object> data){
        System.out.println(11);
        return "success";
    }
}
