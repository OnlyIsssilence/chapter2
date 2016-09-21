package org.smart4j.chapter2.controller;

import org.smart4j.chapter2.model.*;
import org.smart4j.chapter2.service.CustomerService;
import org.smart4j.chapter2.util.DateUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Author:zhangmingqiang.
 * Date  :2016/8/24.
 * Description:
 */
@WebServlet("/pointdetail")
public class PointDetailServlet extends HttpServlet {

    private CustomerService customerService;

    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    private void fillPointDetail(HttpServletRequest req) {
        PointDetailNew pointDetailNew = new PointDetailNew();

        String f_Phone = req.getParameter("f_Phone");
        String f_BuildingKid = req.getParameter("f_BuildingKid");
        String f_PointCode = req.getParameter("f_PointCode");
        String f_AddTime = req.getParameter("f_AddTime");
        String f_PointSource = req.getParameter("f_PointSource");

        int addCount = 1;
        if (req.getParameter("addCount") != null && !req.getParameter("addCount").equals("")) {
            addCount = Integer.parseInt(req.getParameter("addCount"));
        }

        Broker broker = customerService.getBrokerKid(f_Phone);
        OauthInfo oauthInfo = customerService.getOauthList(broker.getKid() + "").get(0);
        PointMainNew pointMainNew = customerService.getPointMainNew(oauthInfo.getF_UserToken());
        pointDetailNew.setF_PointId((long) pointMainNew.getKid());
        pointDetailNew.setF_BuildingKid(Long.valueOf(f_BuildingKid));
        pointDetailNew.setF_PointCode(PointRule.getRule(Integer.valueOf(f_PointCode)));
        pointDetailNew.setF_Point((long) PointWeight.getWeight(Integer.valueOf(f_PointCode)));

        if (f_AddTime != null) {
            pointDetailNew.setF_AddTime(DateUtils.StringToDate(f_AddTime));
        } else {
            pointDetailNew.setF_AddTime(new Date());
        }

        if (f_PointSource != null) {
            pointDetailNew.setF_PointSource(Long.valueOf(f_PointSource));
        } else {
            pointDetailNew.setF_PointSource((long) 500);
        }
        pointDetailNew.setF_ProductExchangeKid((long) 0);

        for (int i = 0; i < addCount; i++) {
            customerService.insertToPointDetail(pointDetailNew);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        fillPointDetail(req);
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/success.jsp");
        try {
            rd.forward(req, resp);
            return;
        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}

































