package org.smart4j.chapter2.model;

import java.util.Date;

/**
 * Author:zhangmingqiang.
 * Date  :2016/9/12.
 * Description:
 */
public class PointDetailNew  {
    private Long kid;
    private Long f_PointId;
    private Long f_BuildingKid;
    private String f_PointCode;
    private Date f_AddTime;
    private Long f_PointSource;
    private Long f_Point;
    private Long f_ProductExchangeKid;

    public Long getF_ProductExchangeKid() {
        return f_ProductExchangeKid;
    }

    public void setF_ProductExchangeKid(Long f_ProductExchangeKid) {
        this.f_ProductExchangeKid = f_ProductExchangeKid;
    }

    public Long getF_Point() {
        return f_Point;
    }

    public void setF_Point(Long f_Point) {
        this.f_Point = f_Point;
    }

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public Long getF_PointId() {
        return f_PointId;
    }

    public void setF_PointId(Long f_PointId) {
        this.f_PointId = f_PointId;
    }

    public Long getF_BuildingKid() {
        return f_BuildingKid;
    }

    public void setF_BuildingKid(Long f_BuildingKid) {
        this.f_BuildingKid = f_BuildingKid;
    }

    public String getF_PointCode() {
        return f_PointCode;
    }

    public void setF_PointCode(String f_PointCode) {
        this.f_PointCode = f_PointCode;
    }

    public Date getF_AddTime() {
        return f_AddTime;
    }

    public void setF_AddTime(Date f_AddTime) {
        this.f_AddTime = f_AddTime;
    }

    public Long getF_PointSource() {
        return f_PointSource;
    }

    public void setF_PointSource(Long f_PointSource) {
        this.f_PointSource = f_PointSource;
    }
}
