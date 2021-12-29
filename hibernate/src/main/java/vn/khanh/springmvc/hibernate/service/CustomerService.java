package vn.khanh.springmvc.hibernate.service;

import java.util.List;

import vn.khanh.springmvc.hibernate.entity.Customer;

public interface CustomerService {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}