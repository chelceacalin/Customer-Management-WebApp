package com.customerTracker.service;

import java.util.List;

import com.customerTracker.work.entity.Customer;


public interface CustomerService {

	public List<Customer>getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int theID);

	public void deleteCustomer(int theID);
}
