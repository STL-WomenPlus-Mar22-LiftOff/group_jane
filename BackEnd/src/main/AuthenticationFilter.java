package main.java.org.launchcode.TimeLeaf;

import main.java.org.launchcode.TimeLeaf.controllers.AuthenticationController;
import main.java.org.launchcode.TimeLeaf.data.UserRepository;
import main.java.org.launchcode.TimeLeaf.models.User;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

// Authentication allows only logged-in users to access a page
public class AuthenticationFilter extends HandlerInterceptorAdapter {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthenticationController authenticationController;

    // Anyone can access these pages without being logged-in
    private static final List<String> whitelist = Arrays.asList("/login", "/register", "/logout", "/css", "/home");

    private static boolean isWhitelisted(String path) {
        for (String pathRoot : whitelist) {
            if (path.startsWith(pathRoot)) {
                return true;
            }
        }
        return false;
    }

//    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws IOException {

        // Don't require sign-in for whitelisted pages
        if (isWhitelisted(request.getRequestURI())) {
            // returning true indicates that the request may proceed
            return true;
        }

        HttpSession session = request.getSession();
        User user = authenticationController.getUserFromSession(session);

        // The user is logged in
        if (user != null) {
            return true;
        }

        // The user is NOT logged in
        response.sendRedirect("/login");
        return false;
    }

}
