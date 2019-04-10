package com.yang.delegate.mvc;

import com.yang.delegate.mvc.controllers.MemberController;
import com.yang.delegate.mvc.controllers.OrderController;
import com.yang.delegate.mvc.controllers.SystemController;
import com.yang.proxy.dbroute.Order;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatcherServlet extends HttpServlet {
    private void doDispatcher(HttpServletRequest request, HttpServletResponse response)throws Exception{
        String uri = request.getRequestURI();
        String mid = request.getParameter("mid");
        if("getMemberById".equals(uri)){
            new MemberController().getMemberById(mid);
        }else if("getOrdererById".equals(uri)){
            new OrderController().getOrdererById(mid);
        }else if("loginOut".equals(uri)){
            new SystemController().loginOut();
        }else{
            response.getWriter().write("404 Not Found!!");
        }
    }

    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,
            IOException {
        try {
            doDispatcher(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
