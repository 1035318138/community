package com.example;

import com.baomidou.mybatisplus.plugins.Page;
import com.example.entity.Community;
import com.example.entity.PageInfo;
import com.example.service.Impl.CommunityServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CommunityApplicationTests {

    @Autowired
    private CommunityServiceImpl communityService;

    @Test
    public void queryList1() {
        PageInfo<Community> pageInfo = new PageInfo<Community>();
        pageInfo.setSize(0);
        pageInfo.setCurrent(1);
        Community community = new Community();
        community.setCommunityName("区");
        pageInfo.setData(community);
        Page<Community> page = communityService.getPage(pageInfo);
        Assert.assertEquals(2,page.getTotal());


    }

}
