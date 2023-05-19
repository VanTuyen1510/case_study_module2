package Furama.controller;

import Furama.models.Customer;
import Furama.models.Employee;
import Furama.services.ICustomerService;
import Furama.services.IEmployeeService;
import Furama.services.impl.CustomerServiceImpl;
import Furama.services.impl.EmployeeServiceImpl;
import Furama.utils.MyUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    private static IEmployeeService employeeService = new EmployeeServiceImpl();
    private static List<Employee> employees = employeeService.displayPerson();
    private static List<Integer> employeeIds = new ArrayList<>();


    private static ICustomerService customerService = new CustomerServiceImpl();
    private static List<Customer> customers = customerService.displayPerson();
    private static List<Long> customerIds = new LinkedList<>();


    public static void main(String[] args) {
        dispalyMainMenu();
    }

    static {
        for (Employee employee : employees) {
            employeeIds.add(employee.getId());
        }

        for (Customer customer: customers) {
            customerIds.add(customer.getCMND());
        }
    }

    public static void dispalyMainMenu() {
        int select = 0;
        do {
            System.out.println("--------Welcome to Furama--------");
            System.out.println("1.Employee Managemnet");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");

            System.out.println("Mời bạn chọn chức năng");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
            }
        }
        while (true);
    }

    public static void displayEmployeeMenu() {
        int select = 0;
        do {
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employees");
            System.out.println("3.Edit employee");
            System.out.println("4.Remove employee");
            System.out.println("5.Return main menu");

            System.out.println("Mời bạn chọn chức năng");
            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1:
                    ArrayList<Employee> emloyeeList = (ArrayList<Employee>) employeeService.displayPerson();
                    for (Employee employee : emloyeeList) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    //  public Employee(int id, String name, String birthday, String gender, int CMND, int phone, String email, String level, String location) {
                    //        super(id, name, birthday, gender, CMND, phone, email);

                    System.out.println("Add new employee ID :");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Add new employee name :");
                    String name = scanner.nextLine();
                    System.out.println("Add new employee birthday");
                    String birthday = scanner.nextLine();
                    System.out.println("Add new employee gender :");
                    String gender = MyUtil.gender();
                    System.out.println("Add new employee CMND");
                    int cmnd = Integer.parseInt(scanner.nextLine());
                    System.out.println("Add new employee phone");
                    int phone = Integer.parseInt(scanner.nextLine());
                    System.out.println("Add new employee email");
                    String email = scanner.nextLine();
                    System.out.println("Add new employee level");
                    String level = MyUtil.level();
                    System.out.println("Add new employee location");
                    String location = MyUtil.location();
                    System.out.println("Add new employee wage");
                    long wage = Long.parseLong(scanner.nextLine());
                    Employee employee = new Employee(id, name, birthday, gender, cmnd, phone, email, level, location,wage);
                    employeeService.addPerson(employee);
                    break;
                case 3:
                    editEmployee();
                    break;

                case 4:
                    System.out.println("Mời bạn nhập id muốn xóa");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    employeeService.removePerson(idDelete);
                    break;
                case 5:
                    break;
            }
        } while (select < 5);
    }

    private static void editEmployee() {
        System.out.println("Mời bạn nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        boolean test = MyUtil.checkId(id, employeeIds);

        if (test) {
            int index = employeeIds.indexOf(id);
            MyUtil.editPersonById(employees.get(index));
            employeeService.editPerson(id, employees.get(index));
            employees = employeeService.displayPerson();
        } else {
            System.out.println("This employee is not exist!");
        }

    }

    public static void displayCustomerMenu() {
        int select = 0;
        do {
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customers");
            System.out.println("3.Edit customer");
            System.out.println("4.Remove customer");
            System.out.println("5.Return main menu");

            System.out.println("Mời bạn chọn chức năng");
            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1:
                    for (Customer customer : customerService.displayPerson()) {
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    //   public Customer(int id, String name, String birthday, String gender, int CMND, int phone, String email, String typeOfGuest, String address) {
                    //   super(id, name, birthday, gender, CMND, phone, email);

                    System.out.println("Add new customer id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Add new customer name :");
                    String name = scanner.nextLine();
                    System.out.println("Add new customer birthday :");
                    String birthday = scanner.nextLine();
                    System.out.println("Add new customer gender:");
                    String gender = MyUtil.gender();
                    System.out.println("Add new customer cmnd :");
                    int cmnd = Integer.parseInt(scanner.nextLine());
                    System.out.println("Add new customer phone");
                    int phone = Integer.parseInt(scanner.nextLine());
                    System.out.println("Add new customer email");
                    String email = scanner.nextLine();
                    System.out.println("Add new customer typeOfGuest");
                    String typeOfGuest = MyUtil.typeOfGuest();
                    System.out.println("Add new customer address:");
                    String address = scanner.nextLine();


                    Customer customer = new Customer(id,name,birthday,gender,cmnd,phone,email,typeOfGuest,address);
                    customerService.addPerson(customer);
                    break;
                case 3:editCustomer();
                    break;
                case 4:
                    System.out.println("Mời bạn nhập name để xóa");
                    String nameRemove = scanner.nextLine();
                    customerService.removePerson(nameRemove);
                    break;
                case 5:
                    break;
            }
        } while (true);
    }

    //Phương thức indexOf() trả về chỉ số của giá trị ký tự đã cho hoặc chuỗi con. Nếu không tìm thấy trả lại giá trị -1. Chỉ số (index) được đếm từ 0.
    public static void editCustomer(){
        System.out.println("Mời bạn nhập cmnd khách hàng");
        int cmnd = Integer.parseInt(scanner.nextLine());
        boolean test = MyUtil.checkCmnd(cmnd,customerIds);
        if(test){
            int index = customerIds.indexOf(cmnd);
            MyUtil.editCustomerByCmnd(customers.get(index));
            customers = customerService.displayPerson();
        }else {
            System.out.println("This employee is not exist!");
        }

    }


    public static void displayFacilityMenu() {
        int select = 0;
        do {
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility maintenance");
            System.out.println("4.Remove list facility");
            System.out.println("5.Return main menu");

            System.out.println("Mời bạn chọn chức năng");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }

        }while (select < 5) ;
    }


    public static void displayBookingMenu(){
        int select = 0;
        do {
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new contracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contracts");
            System.out.println("6.Return main menu");

            System.out.println("Mời bạn chọn chức năng");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }

        }while (select < 6) ;
    }

    public static void displayPromotionMenu(){
        int select = 0;
        do {
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Return main menu");

            System.out.println("Mời bạn chọn chức năng");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;

            }

        }while (select < 3) ;
    }



}
