package com.zhao.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        System.out.println(path);
        if("/student/save.do".equals(path)){
            save(request,response);
        }else if("/student/update.do".equals(path)){
            update(request,response);
        }else if("/student/delete.do".equals(path)){
            delete(request,response);

        }else if("/student/select.do".equals(path)){
            select(request,response);

        }
    }

    private void select(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("select");
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("delete");

    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("update");

    }

    private void save(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("save");

    }
}
