package org.smart4j.chapter2.model;

/**
 * Author:zhangmingqiang.
 * Date  :2016/9/12.
 * Description:
 */
public class BrokerEntity {
    private String f_Phone;
    private Long Kid;
    private int pointKid;
    private String f_UserToken;
    private int f_PointAll;
    private int f_PointCash;
    private int f_PointBalance;
    private String f_Title;


    public Long getKid() {
        return Kid;
    }

    public void setKid(Long kid) {
        Kid = kid;
    }

    public int getPointKid() {
        return pointKid;
    }

    public void setPointKid(int pointKid) {
        this.pointKid = pointKid;
    }

    public String getF_UserToken() {
        return f_UserToken;
    }

    public void setF_UserToken(String f_UserToken) {
        this.f_UserToken = f_UserToken;
    }

    public int getF_PointAll() {
        return f_PointAll;
    }

    public void setF_PointAll(int f_PointAll) {
        this.f_PointAll = f_PointAll;
    }

    public int getF_PointCash() {
        return f_PointCash;
    }

    public void setF_PointCash(int f_PointCash) {
        this.f_PointCash = f_PointCash;
    }

    public int getF_PointBalance() {
        return f_PointBalance;
    }

    public void setF_PointBalance(int f_PointBalance) {
        this.f_PointBalance = f_PointBalance;
    }

    public String getF_Phone() {
        return f_Phone;
    }

    public void setF_Phone(String f_Phone) {
        this.f_Phone = f_Phone;
    }

    public String getF_Title() {
        return f_Title;
    }

    public void setF_Title(String f_Title) {
        this.f_Title = f_Title;
    }
}
