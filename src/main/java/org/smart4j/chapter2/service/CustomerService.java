package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Author:zhangmingqiang.
 * Date  :2016/8/24.
 * Description:服务层，是控制层和数据库的桥梁
 */
public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList(){
        Connection conn = DatabaseHelper.getConnnection();
        try {
            String sql = "SELECT * FROM customer";
            return DatabaseHelper.queryEntityList(Customer.class,conn,sql);
        }finally {
            DatabaseHelper.closeConnection(conn);
        }
    }
    
    public Customer getCustomer(long id){
        // TODO: 2016/8/24  
        return null;
    }
    
    public boolean createCustomer(Map<String,Object> fieldMap){
        // TODO: 2016/8/24  
        return false;
    }
    
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        // TODO: 2016/8/24  
        return false;
    }
    
    public boolean deleteCustomer(long id){
        // TODO: 2016/8/24
        return false;
    }
}
