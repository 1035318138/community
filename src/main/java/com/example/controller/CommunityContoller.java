package com.example.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.example.entity.Community;
import com.example.entity.PageInfo;
import com.example.service.CommunityService;
import com.example.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author ：mac
 * @Date ：2022/8/22 10:09
 */
@RestController
@RequestMapping(path = "community")
@Api(tags = "小区相关接口",value = "小区接口，提供小区信息的增、删、改、查")
@AllArgsConstructor
@EnableSwagger2
public class CommunityContoller {

    private final CommunityService communityService;

    @RequestMapping(method = RequestMethod.GET, path = "listAllCommunity")
    @ApiOperation("小区查询接口")
    @ApiImplicitParam(value = "查询小区信息且分页", name = "communityPage", required = true, paramType = "query", dataType = "String")
    public R<Page<Community>> listAllCommunity(@RequestBody
                                               @ApiParam("分页+小区") PageInfo<Community> communityPage) {
        return R.ok(communityService.getPage(communityPage));
    }

    /*@DeleteMapping("/delete/{id}")
    @ApiOperation("小区根据ID删除")
    @ApiImplicitParam(value = "根据ID查询删除", name = "id", paramType = "query", dataType = "Integer")
    public R<String> deleteBySno(@PathVariable Integer id) {
        communityService.deleteBySno(id);
        return R.ok("删除成功");
    }*/

    /*@PostMapping("saveOrUpdate")
    @ApiOperation("新增或修改小区信息")
    @ApiImplicitParam(value = "新增或修改小区信息", name = "communityDTO", paramType = "query", dataType = "String")
    public R<String> saveOrUpdate(@RequestBody @Validated CommunityDTO communityDTO) {
        communityService.saveOrUpdate(communityDTO);
        return R.ok("新增成功");
    }*/

    @RequestMapping(method = RequestMethod.POST, path = "saveOrUpdate")
    @ApiOperation("新增小区接口")
    @ApiImplicitParam(value = "新增小区内容信息", name = "community", paramType = "body", dataType = "String")
    public R<String> saveOrUpdate(@RequestBody @Validated @PathVariable("community") Community community) {
        communityService.insertCommunity(community);
        return R.ok("新增成功");
    }
}
