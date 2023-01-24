package com.gardenPlanner.gardenPlanner;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthenticationFilter extends HandlerInterceptorAdapter {

//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    AuthenticationController authenticationController;
//
//    private static final List<String> whitelist = Arrays.asList("index","/login", "/register", "/logout", "/css");
//
//    private static boolean isWhitelisted(String path) {
//        for (String pathRoot : whitelist) {
//            if (path.startsWith(pathRoot)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public boolean preHandle(HttpServletRequest request,
//                             HttpServletResponse response,
//                             Object handler) throws IOException {
//
//        // Don't require sign-in for whitelisted pages
//        if (isWhitelisted(request.getRequestURI())) {
//            // returning true indicates that the request may proceed
//            return true;
//        }
//
//        HttpSession session = request.getSession();
//        User user = authenticationController.getUserFromSession(session);
//
//        // The user is logged in
//        if (user != null) {
//            return true;
//        }
//
//        // The user is NOT logged in
//        response.sendRedirect("/login");
//        return false;
//    }

}

