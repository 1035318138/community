package com.example.service.Impl;


import com.baomidou.mybatisplus.plugins.Page;
import com.example.entity.Community;
import com.example.entity.PageInfo;
import com.example.mapper.CommunityMapper;
import com.example.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：mac
 * @Date ：2022/8/22 10:48
 */
@Service
public class CommunityServiceImpl implements CommunityService {



    @Autowired
    private CommunityMapper communityMapper;

    @Override
    public Page<Community> getPage(PageInfo<Community> community) {
        Page<Community> page = new Page<>(community.getCurrent(),community.getSize());
        List<Community> list = communityMapper.getList(community);
        page.setRecords(list);
        page.setTotal(communityMapper.getListCount(community).size());
        return page;
    }

    @Override
    public void insertCommunity(Community community) {

    }

    /*@Override
    public void deleteBySno(Integer id) {
        this.removeById(id);
        userService.remove(new LambdaUpdateWrapper<User>()
                .eq(User::getCommunityId, id));
    }*/

   /* @Override
    public void saveOrUpdate(CommunityDTO communityDTO) {
        Community community = this.getById(communityDTO.getId());
        if (community != null) {
            // 修改
            BeanUtil.copyProperties(communityDTO, community);
            community.setUpdateTime(new Date());
        } else {
            community = BeanUtil.copyProperties(communityDTO, Community.class);
            community.setUpdateTime(new Date());
            community.setCreateTime(new Date());
            *//*community.setCreateBy("admin");*//*
        }
        this.saveOrUpdate(community);
    }*/

}
