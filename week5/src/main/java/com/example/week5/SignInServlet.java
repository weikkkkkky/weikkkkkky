package com.example.week5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignInServlet", value = "/sign-in")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("sign-in.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        String name = req.getParameter("inputName");
        if(req.getSession().getAttribute("user")==null){
            if(name.equals("Tom")){
                if (req.getParameter("password").equals("abc123y")){
                    req.getSession().setAttribute("user",name);
                    resp.sendRedirect("index");
                }
                else{
                    req.getSession().setAttribute("user",null);
                    out.println("wrong psd, no user");
                }

            }else if(name.equals("James")){
                if (req.getParameter("password").equals("ut$034u")){
                    req.getSession().setAttribute("user",name);
                    resp.sendRedirect("index");
                }
                else{
                    req.getSession().setAttribute("user",null);
                    out.println("wrong psd, no user");
                }
            }else {
                req.getSession().setAttribute("user",name);
                resp.sendRedirect("index");
            }
        }
else{
    resp.sendRedirect("index");
        }
    }
}