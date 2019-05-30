package com.xdleague.dahei01.service;

import com.xdleague.dahei01.Utils.CookieUtils;
import com.xdleague.dahei01.Utils.ResulUtils;
import com.xdleague.dahei01.constt.ConstResource;
import com.xdleague.dahei01.dao.UserDao;
import com.xdleague.dahei01.enumes.ResultCodeEnum;
import com.xdleague.dahei01.model.domain.UserDo;
import com.xdleague.dahei01.model.dto.InsertAdminDto;
import com.xdleague.dahei01.model.dto.LoginDto;
import com.xdleague.dahei01.model.po.UserPo;
import com.xdleague.dahei01.model.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

@Service
public class LoginService {
    @Autowired
    UserDao userDao;

    public ResultVo login(LoginDto loginDto, HttpServletResponse response) {

        UserPo userpo = userDao.getInfoByName(loginDto.getUserName());
        if (userpo == null)
            return ResulUtils.getResult(ResultCodeEnum.FAIL, null, "没找到管理员名字...");
        String pwd = CookieUtils.buildPwd(loginDto.getPassWord());
        if (!pwd.equals(userpo.getPassWord()))
            return ResulUtils.getResult(ResultCodeEnum.FAIL, null, "密码错误...");
        UserDo userDo = new UserDo();
        userDo.setUid(userpo.getId());
        userDo.setName(userpo.getUserName());
        String cookieValue = CookieUtils.buildValue(userDo);
        //写cookie
        CookieUtils.writeCookie(ConstResource.COOKIE_NAME, cookieValue, response);
        return ResulUtils.getResult(ResultCodeEnum.SUCCESS, userDo, "登录成功");
    }

    public ResultVo insertAdmin(InsertAdminDto insertAdminDto) {
        //判null

        int i = userDao.insertAdmin(insertAdminDto);
        if (i <= 0)
            return ResulUtils.getResult(ResultCodeEnum.FAIL, null, "添加失败");
        return ResulUtils.getResult(ResultCodeEnum.SUCCESS, insertAdminDto, "添加管理员成功...");

    }
}
