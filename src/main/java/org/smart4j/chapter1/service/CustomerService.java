package org.smart4j.chapter1.service;

import java.util.List;
import java.util.Map;
import org.smart4j.chapter1.helper.DatabaseHelper;
import org.smart4j.chapter1.model.Customer;

/**
 * help Controller and Database with service layout
 *
 * 提供客户数据服务
 */
public class CustomerService {

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(int id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(int id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(int id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
