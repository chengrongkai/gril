package com.crk.gril;

import com.crk.gril.domain.Gril;
import com.crk.gril.service.GrilService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GrilServiceTests {
    @Autowired
    private GrilService grilService;
    @Test
    @Transactional
    public void contextLoads() {
        Gril gril = grilService.findOne(29);
        Assert.assertEquals(new Integer(9),((Gril) gril).getAge());
    }

}
