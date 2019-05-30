package com.xdleague.dahei01.intercept;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

@Service
public class LoginInterceptor implements HandlerInterceptor {

//    private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);


  /*  @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod) {
            String cookie = CookieUtil.getCookie(request, ConstResource.NEWS_COOKIE_NAME);
            UserDo userDo = CookieUtil.getUserDo(cookie);
            if (userDo != null && userDo.getUid() > 0) {
                request.getSession().setAttribute(ConstResource.SESSION_UID, userDo.getUid());
            }
        }
        return true;
    }*/
}
