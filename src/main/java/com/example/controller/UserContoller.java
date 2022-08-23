/*
package com.example.controller;

import com.example.dto.CommunityDTO;
import com.example.dto.UserDTO;
import com.example.entity.Community;
import com.example.service.CommunityService;
import com.example.service.UserService;
import com.example.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

*/
/**
 * @author ：mac
 * @Date ：2022/8/22 09:54
 *//*

@Api(tags = "用户")
@RestController
@RequestMapping(path = "user")
@AllArgsConstructor
public class UserContoller {

    private final UserService userService;

    @PostMapping("/delete/{id}")
    @ApiOperation("根据ID删除")
    @ApiImplicitParam(value = "新增或修改小区信息", name = "communityDTO", paramType = "query", dataType = "String")
    public R<String> deleteBySno(@PathVariable Integer id) {
        userService.deleteBySno(id);
        return R.ok("删除成功");
    }

    @PostMapping("saveOrUpdate")
    @ApiOperation("新增或修改人员")
    @ApiImplicitParam(value = "新增或修改人员信息", name = "userDTO", paramType = "query", dataType = "String")
    public R<String> saveOrUpdate(@RequestBody @Validated UserDTO userDTO) {
        userService.saveOrUpdate(userDTO);
        return R.ok("新增成功");
    }
}
*/
