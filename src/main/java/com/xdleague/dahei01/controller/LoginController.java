package com.xdleague.dahei01.controller;

import com.xdleague.dahei01.model.dto.InsertAdminDto;
import com.xdleague.dahei01.model.dto.LoginDto;
import com.xdleague.dahei01.model.vo.ResultVo;
import com.xdleague.dahei01.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RequestMapping(value = "/login")
@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping("/loginAdmin")
    public ResultVo loginAdmin(@RequestBody LoginDto loginDto, HttpServletResponse response) {
        return loginService.login(loginDto, response);
    }

    @PostMapping("/insertAdmin")
    public ResultVo insertAdmin(@RequestBody InsertAdminDto insertAdminDto) {

        return loginService.insertAdmin(insertAdminDto);
    }
}

