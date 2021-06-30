package servlet;

import utils.PropertiesUtil;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String isChecked = request.getParameter("isChecked");

        String passwordInFile = PropertiesUtil.config.getProperty(account);

        if (passwordInFile == null) {
            request.setAttribute("flag", "noUser");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        else{
            if(passwordInFile.equals(password)){
                if("1".equals(isChecked)){
                    Cookie cookie = new Cookie("user", account);
                    cookie.setPath("/");
                    cookie.setMaxAge(1000 * 60 * 60 * 24 * 7);
                    response.addCookie(cookie);
                }

                request.getRequestDispatcher("/hello.jsp").forward(request, response);
            }
            else{
                request.setAttribute("flag", "wrong");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

}
