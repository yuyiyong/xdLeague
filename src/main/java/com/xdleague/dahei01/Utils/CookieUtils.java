package com.xdleague.dahei01.Utils;

import com.xdleague.dahei01.constt.ConstResource;
import com.xdleague.dahei01.model.domain.UserDo;
import hydh.libinfrastructure.EncryptUtils;
import hydh.libinfrastructure.JsonUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {
    public static String buildValue(UserDo userDo) {
        String json = JsonUtils.jsonSerialize(userDo);
        String encryptJson = EncryptUtils.desEncrypt(ConstResource.COOKIE_PWD, json);
        return encryptJson;
    }

    public static void writeCookie(String cookieName, String cookieValue, HttpServletResponse response) {
        Cookie cookie = new Cookie(cookieName, cookieValue);
        cookie.setPath("/");
        cookie.setMaxAge(Integer.MAX_VALUE);
        response.addCookie(cookie);
    }


    public static String buildPwd(String passWord) {
        return EncryptUtils.md5Encrypt32(passWord);
    }
}
