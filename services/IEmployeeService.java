package Furama.services;

import Furama.models.Employee;

import java.util.ArrayList;
import java.util.List;

public interface IEmployeeService extends IService {
    List<Employee> displayPerson();
    List<Employee> addPerson(Employee employee);
    void editPerson(int id ,Employee employee);
    List<Employee> removePerson(int id);
}
