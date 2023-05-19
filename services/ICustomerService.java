package Furama.services;

import Furama.models.Customer;
import Furama.models.Employee;

import java.util.List;

public interface ICustomerService extends IService{
    List<Customer> displayPerson();
    List<Customer> addPerson(Customer customer);
    void editPerson(int cmnd, Customer customer);
    List<Customer> removePerson(String name);

}
