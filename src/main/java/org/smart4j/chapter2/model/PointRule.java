package org.smart4j.chapter2.model;

/**
 * Author:zhangmingqiang.
 * Date  :2016/9/13.
 * Description:
 */
public enum PointRule {

    chengjiao("weixin.broker.apply.confirm.business", 1),
    daikan("weixin.broker.apply.confirm.look", 2),
    tuike("weixin.customer.push",3),
    putongtie("weixin.customer.push", 4),
    retie("top.esf.hottopic", 5),
    shoufatie("top.esf.firstpublishtopic", 6),
    qiandao("api.all.signin", 7),
    pinglun("top.esf.commenttopic", 8);

    // 成员变量
    private String rule;
    private int index;

    // 构造方法
    private PointRule(String rule, int index) {
        this.rule = rule;
        this.index = index;
    }

    // 普通方法
    public static String getRule(int index) {
        for (PointRule c : PointRule.values()) {
            if (c.getIndex() == index) {
                return c.rule;
            }
        }
        return null;
    }

    // get set 方法
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
