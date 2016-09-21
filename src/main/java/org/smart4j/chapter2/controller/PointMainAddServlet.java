package org.smart4j.chapter2.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:zhangmingqiang.
 * Date  :2016/8/24.
 * Description:
 */

@WebServlet("/pointmainadd")
public class PointMainAddServlet extends HttpServlet{

    @Override
    public void init()throws ServletException{
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/addpoint.jsp");
        try {
            rd.forward(req, resp);
            return;
        }catch(Exception e){}
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
