package org.smart4j.chapter2.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:zhangmingqiang.
 * Date  :2016/9/13.
 * Description:
 */
public class DateUtils {

    /**
     * string 转换为 date类型
     * @param dateStr
     * @return
     * @throws ParseException
     */
    public static Date StringToDate(String dateStr)  {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
