package org.smart4j.chapter2.model;

/**
 * Author:zhangmingqiang.
 * Date  :2016/9/12.
 * Description:
 */
public class OauthInfo {

    private int kid;
    private String f_UserToken;
    private int f_BrokerKid;

    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    public String getF_UserToken() {
        return f_UserToken;
    }

    public void setF_UserToken(String f_UserToken) {
        this.f_UserToken = f_UserToken;
    }

    public int getF_BrokerKid() {
        return f_BrokerKid;
    }

    public void setF_BrokerKid(int f_BrokerKid) {
        this.f_BrokerKid = f_BrokerKid;
    }
}
