package vn.khanh.springmvc.hibernate.dao;

import java.util.List;

import vn.khanh.springmvc.hibernate.entity.Customer;

public interface CustomerDAO {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}