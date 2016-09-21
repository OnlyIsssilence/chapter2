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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Author:zhangmingqiang.
 * Date  :2016/8/24.
 * Description:
 */
@WebServlet("/broker")
public class BrokerServlet extends HttpServlet {

    private CustomerService customerService;

    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd;

        BrokerEntity brokerEntity = new BrokerEntity();
        List<BrokerEntity> brokerEntityList = new ArrayList<>();

        String f_Phone = req.getParameter("f_Phone");
        Broker broker = customerService.getBrokerKid(f_Phone);

        brokerEntity.setKid(broker.getKid());
        brokerEntity.setF_Title(broker.getF_Title());
        brokerEntity.setF_Phone(broker.getF_Phone());

        OauthInfo oauthInfo = customerService.getOauthList(broker.getKid() + "").get(0);

        PointMainNew pointMainNew = customerService.getPointMainNew(oauthInfo.getF_UserToken());

        if (pointMainNew == null){
            rd = req.getRequestDispatcher("/WEB-INF/view/fail.jsp");
            try {
                rd.forward(req, resp);
                return;
            } catch (Exception e) {
            }
        }

        brokerEntity.setPointKid(pointMainNew.getKid());
        brokerEntity.setF_PointAll(pointMainNew.getF_PointAll());
        brokerEntity.setF_PointBalance(pointMainNew.getF_PointBalance());
        brokerEntity.setF_PointCash(pointMainNew.getF_PointCash());
        brokerEntity.setF_UserToken(oauthInfo.getF_UserToken());
        brokerEntityList.add(brokerEntity);

        List<PointDetailNew> pointDetailNewList = customerService.getPointDetailNewlist(pointMainNew.getKid());

        req.setAttribute("brokerEntityList",brokerEntityList);
        req.setAttribute("pointDetailNewList",pointDetailNewList);

        rd = req.getRequestDispatcher("/WEB-INF/view/broker.jsp");
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

































