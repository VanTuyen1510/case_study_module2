package Furama.services.impl;

import Furama.models.Employee;
import Furama.services.IEmployeeService;
import Furama.services.IService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private static List<Employee> employees = new ArrayList<>();
    private static int size = 0;

//  public Employee(int id, String name, String birthday, String gender, int CMND, int phone, String email, String level, String location) {
//        super(id, name, birthday, gender, CMND, phone, email);
    static {
        Employee employee1 = new Employee(1,"Minh","nam","09/05/1997",012,105,"minh@gmail.com","Trung Cấp","Lễ Tân");
        Employee employee2 = new Employee(2,"Hằng","nữ","09/04/1997",016,202,"hang@gmail.com","Đại Học","Quản lý");
        employees.add(employee1);
        employees.add(employee2);
    }

    @Override
    public List<Employee> displayPerson() {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            employeeList.set(i,employees.get(i));
        }
        return  employees;
    }

    @Override
    public List<Employee> addPerson(Employee employee) {
       employees.add(employee);
       return employees;
    }

    @Override
    public void editPerson(int id, Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if(id == employees.get(i).getId()){
                employees.set(i,employee);
            }
        }
    }

    @Override
    public List<Employee> removePerson(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if(id == employees.get(i).getId()){
                employees.remove(i);
            }
        }
        return employees;
    }


}
