package org.smart4j.chapter2.model;

/**
 * Author:zhangmingqiang.
 * Date  :2016/9/12.
 * Description:
 */
public class Broker {
    private String f_Phone;
    private Long Kid;
    private String f_Title;

    public Long getKid() {
        return Kid;
    }

    public void setKid(Long kid) {
        Kid = kid;
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
