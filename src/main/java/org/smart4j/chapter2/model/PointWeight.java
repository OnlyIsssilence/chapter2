package org.smart4j.chapter2.model;

/**
 * Author:zhangmingqiang.
 * Date  :2016/9/13.
 * Description:
 */
public enum PointWeight {

    chengjiao(3000, 1),
    daikan(400, 2),
    tuike(1,3),
    putongtie(3, 4),
    retie(100, 5),
    shoufatie(30, 6),
    qiandao(1, 7),
    pinglun(1, 8);

    // 成员变量
    private int weight;
    private int index;

    // 构造方法
    private PointWeight(int weight, int index) {
        this.weight = weight;
        this.index = index;
    }

    // 普通方法
    public static int getWeight(int index) {
        for (PointWeight c : PointWeight.values()) {
            if (c.getIndex() == index) {
                return c.weight;
            }
        }
        return 0;
    }

    // get set 方法
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
