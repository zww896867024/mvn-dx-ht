//package com.gu.admin.controller;
//
//import com.gu.admin.pojo.bo.AdminAddBO;
//import com.gu.admin.pojo.bo.AdminEditBO;
//import com.gu.admin.pojo.bo.AdminLoginBO;
//import com.gu.admin.service.AdminService;
//import com.gu.common.pojo.bo.ListBO;
//import com.gu.common.utils.Result;
//import com.gu.shirojwt.jwt.JwtUtil;
//import org.apache.shiro.authz.annotation.RequiresRoles;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//
///**
// * @author GJL
// * @title AdminController
// * @description
// * @date 2020-08-13 10:41
// */
//@Validated
//@RestController
//@RequestMapping("/admin")
//public class AdminController {
//    @Autowired
//    private AdminService adminService;
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    /**
//     * 登录
//     * @param loginBO
//     * @return
//     */
//    @PostMapping("/login")
//    public Result login(@RequestBody @Valid AdminLoginBO loginBO) {
//        return Result.success(adminService.login(loginBO));
//    }
//
//    /**
//     * 超级管理员登录
//     * @param loginBO
//     * @return
//     */
//    @PostMapping("/superLogin")
//    public Result superLogin(@RequestBody @Valid AdminLoginBO loginBO) {
//        if (!loginBO.getUsername().equals("admin")) {
//            return Result.error("账号密码错误");
//        }
//        return Result.success(adminService.login(loginBO));
//    }
//
//    /**
//     * 重置密码
//     * @param password
//     * @return
//     */
//    @PostMapping("/resetPwd")
//    public Result resetPwd(@NotBlank(message = "密码为空") String password) {
//        adminService.resetPassword(jwtUtil.getUserId(),password);
//        return Result.success();
//    }
//
//    /**
//     * 修改头像
//     * @param avatar
//     * @return
//     */
//    @PostMapping("/updAvatar")
//    public Result updAvatar(@NotBlank(message = "头像为空") String avatar) {
//        adminService.updateAvatar(jwtUtil.getUserId(), avatar);
//        return Result.success();
//    }
//
//    /**
//     * 创建管理员
//     * @param addBO
//     * @return
//     */
//    @RequiresRoles("admin")
//    @PostMapping("/create")
//    public Result create(@RequestBody @Valid AdminAddBO addBO) {
//        adminService.createAdmin(addBO);
//        return Result.success();
//    }
//
//    /**
//     * 修改管理员
//     * @param editBO
//     * @return
//     */
//    @RequiresRoles("admin")
//    @PostMapping("/update")
//    public Result update(@RequestBody @Valid AdminEditBO editBO) {
//        adminService.updateAdmin(editBO);
//        return Result.success();
//    }
//
//    /**
//     * 删除管理员
//     * @param adminId
//     * @return
//     */
//    @RequiresRoles("admin")
//    @PostMapping("/delete")
//    public Result delete(@NotNull(message = "管理员id为空") Integer adminId) {
//        adminService.deleteAdmin(adminId);
//        return Result.success();
//    }
//
//    /**
//     * 管理员列表
//     * @param listBO
//     * @return
//     */
//    @GetMapping("/list")
//    public Result list(ListBO listBO) {
//        return Result.success(adminService.getAdminList(listBO));
//    }
//
//    /**
//     * 管理员详情
//     * @param adminId
//     * @return
//     */
//    @GetMapping("/detail")
//    public Result detail(Integer adminId) {
//        if (adminId == null) {
//            adminId = jwtUtil.getUserId();
//        }
//        return Result.success(adminService.getAdminDetail(adminId));
//    }
//}
