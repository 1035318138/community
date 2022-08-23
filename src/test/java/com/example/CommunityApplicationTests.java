package com.example;

import com.baomidou.mybatisplus.plugins.Page;
import com.example.entity.Community;
import com.example.service.Impl.CommunityServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CommunityApplicationTests {

    @Autowired
    public CommunityServiceImpl communityService;

    @Test
    public void queryList1(){
//        Community community = Community.builder().communityName("区").build();
//
//        PageInfo<Community> pageInfo = new PageInfo();
//        pageInfo.setSize(1);
//        pageInfo.setCurrent(0);
//        pageInfo.setData(community);


        Page<Community> result = communityService.getPage(null);

//        Assert.assertNotNull("数据不能为空",result.getRecords());


    }

}
