package Furama.services.impl;

import Furama.models.Customer;
import Furama.models.Employee;
import Furama.services.ICustomerService;

import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private static List<Customer> customers = new LinkedList<>();
    private static int size = 0;
    static {
//   public Customer(int id, String name, String birthday, String gender, int CMND, int phone, String email, String typeOfGuest, String address) {
//        super(id, name, birthday, gender, CMND, phone, email);
        Customer customer1 = new Customer(1,"Thông","24/10/1997","Nam" ,01,01,"Thong@gmail.com","Diamond","59-Nguyễn Công Trứ");
        Customer customer2 = new Customer(2,"Đạt","15/07/1997","Nam" ,02,02,"Dat@gmail.com","Silver","05-Nguyên Hồng");
        customers.add(customer1);
        customers.add(customer2);
    }

    @Override
    public List<Customer> displayPerson() {
        List<Customer> customerList = new LinkedList<>();
        for (int i = 0; i < customerList.size(); i++) {
            customerList.set(i,customers.get(i));
        }
        return customers;
    }

    @Override
    public List<Customer> addPerson(Customer customer) {
        customers.add(customer);
        return customers;
    }

    @Override
    public void editPerson(int cmnd, Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if(cmnd == customers.get(i).getId()){
                customers.set(i,customer);
            }
        }
    }

    @Override
    public List<Customer> removePerson(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if(name.equalsIgnoreCase(customers.get(i).getName().trim())){
                customers.remove(i);
            }
        }
        return customers;
    }
}
