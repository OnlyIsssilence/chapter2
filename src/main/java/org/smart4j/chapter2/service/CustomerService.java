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
        // TODO: 2016/8/24
        Connection conn = null;
        try {
            List<Customer> customerList = new ArrayList<>();
            String sql = "SELECT * FROM customer";
            conn = DatabaseHelper.getConnnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                Customer customer = new Customer();
                customer.setTelephone(rs.getString("telephone"));
                customer.setName(rs.getString("name"));
                customer.setId(rs.getLong("id"));
                customer.setEmail(rs.getString("email"));
                customer.setRemark(rs.getString("remark"));
                customerList.add(customer);
            }
            return customerList;
        }catch (SQLException e){
            LOGGER.error("close connection failure",e);
        }finally {
            DatabaseHelper.closeConnection(conn);
        }
        return  null;
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
