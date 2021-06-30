package servlet;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, Cookie> cookieMap = new ConcurrentHashMap<>();
        Cookie[] cookies = request.getCookies();

        if(null != cookies){
            Arrays.stream(cookies).forEach( element -> {
                cookieMap.put(element.getName(), element);
            });
        }

        Cookie user = cookieMap.get("user");
        if(user != null){
            request.getRequestDispatcher("/hello.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
