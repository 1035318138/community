package com.example.service;


import com.baomidou.mybatisplus.plugins.Page;
import com.example.entity.Community;
import com.example.entity.PageInfo;


/**
 * @author ：mac
 * @Date ：2022/8/22 10:48
 */

public interface CommunityService{

    Page<Community> getPage(PageInfo<Community> communityPage);

    void insertCommunity(Community community);

//    void deleteBySno(Integer id);

//    void saveOrUpdate(CommunityDTO communityDTO);
}
