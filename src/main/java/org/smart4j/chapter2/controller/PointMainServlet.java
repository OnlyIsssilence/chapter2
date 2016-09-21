package org.smart4j.chapter2.controller;

import org.smart4j.chapter2.service.CustomerService;
import org.smart4j.chapter2.util.StringUtil;

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
@WebServlet("/pointmain")
public class PointMainServlet extends HttpServlet {

    private CustomerService customerService;

    @Override
    public void init()throws ServletException{
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd;
        String f_Phone = req.getParameter("f_Phone");
        String f_Point = req.getParameter("f_Point");

        if (StringUtil.isEmpty(f_Phone) || f_Phone.equals("")
                || StringUtil.isEmpty(f_Point) || f_Point.equals("")){
            rd = req.getRequestDispatcher("/WEB-INF/view/fail.jsp");
            try {
                rd.forward(req, resp);
                return;
            }catch(Exception e){}
        }

        customerService.updatePointMain(f_Phone,Integer.parseInt(f_Point));

        rd = req.getRequestDispatcher("/WEB-INF/view/success.jsp");
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

































