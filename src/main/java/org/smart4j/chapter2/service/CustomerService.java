package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:zhangmingqiang.
 * Date  :2016/8/24.
 * Description:服务层，是控制层和数据库的桥梁
 */
public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 积分列表
     * @return
     */
    public List<PointMainNew> getPointMainNewList() {
        String sql = "SELECT * FROM t_pointmain_new";
        return DatabaseHelper.queryEntityList(PointMainNew.class, sql);
    }


    /**
     * 积分细则列表
     * @param pointId
     * @return
     */
    public List<PointDetailNew> getPointDetailNewlist(int pointId) {
        String sql = "SELECT * FROM t_pointdetail_new where F_PointId = " + pointId;
        return DatabaseHelper.queryEntityList(PointDetailNew.class, sql);
    }

    /**
     * 根据手机号以及积分总分修改积分表
     * @param phone
     * @param point
     * @return
     */
    public int updatePointMain(String phone,int point) {
        Broker broker = getBrokerKid(phone);
        OauthInfo oauthInfo = getOauthList(broker.getKid() + "").get(0);
        PointMainNew pointMainNew = getPointMainNew(oauthInfo.getF_UserToken());

        int pointAll = pointMainNew.getF_PointAll() + point;
        int pointBalance = pointMainNew.getF_PointBalance() + point;

        String sql = "UPDATE t_pointmain_new " +
                "SET F_PointAll = " + pointAll +
                ",F_PointBalance = " +pointBalance +
                " WHERE F_UserToken = " + "'" + oauthInfo.getF_UserToken()+"'";
        return DatabaseHelper.executeUpdate(sql);
    }

    /**
     * 插入一条数据
     * @param pointDetailNew
     * @return
     */
    public boolean insertToPointDetail( PointDetailNew pointDetailNew){

        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("F_PointId",pointDetailNew.getF_PointId());
        fieldMap.put("F_BuildingKid",pointDetailNew.getF_BuildingKid());
        fieldMap.put("F_PointCode",pointDetailNew.getF_PointCode());
        fieldMap.put("F_Point",pointDetailNew.getF_Point());
        fieldMap.put("F_AddTime",pointDetailNew.getF_AddTime());
        fieldMap.put("F_PointSource",pointDetailNew.getF_PointSource());
        fieldMap.put("F_ProductExchangeKid",pointDetailNew.getF_ProductExchangeKid());

        return DatabaseHelper.insertEntity(PointDetailNew.class,fieldMap);
    }

    /**
     * 根据UK查找积分表，获取具体的积分ID
     * @param userToken
     * @return
     */
    public PointMainNew getPointMainNew(String userToken) {
        String sql = "SELECT * FROM t_pointmain_new where F_UserToken=" + "'" + userToken + "'";
        return DatabaseHelper.queryEntity(PointMainNew.class, sql);
    }


    /**
     * 通过经纪人id查询UK
     * @param brokerKid
     * @return
     */
    public List<OauthInfo> getOauthList(String brokerKid){
        String sql = "SELECT * FROM t_oauthinfo where F_BrokerKid=" + brokerKid;
        return DatabaseHelper.queryEntityList(OauthInfo.class, sql);
    }


    /**
     * 根据手机号查询经纪人得到经纪人ID
     * @param phone
     * @return
     */
    public Broker getBrokerKid(String phone) {
        String sql = "SELECT * FROM t_broker where F_Phone=" + phone;
        return DatabaseHelper.queryEntity(Broker.class, sql);
    }

    /**
     * 根据手机号查询经纪人得到经纪人ID
     * @param phone
     * @return
     */
    public List<Broker> getBrokerList(String phone) {
        String sql = "SELECT * FROM t_broker where F_Phone=" + phone;
        return DatabaseHelper.queryEntityList(Broker.class, sql);
    }


    /**
     * 删除积分细则
     * @param kid
     * @return
     */
    public boolean deletePointDetail(long kid){
        return DatabaseHelper.deleteEntity(PointDetailNew.class, kid);
    }

}
