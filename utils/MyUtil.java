package Furama.utils;

import Furama.models.Customer;
import Furama.models.Employee;

import java.util.List;
import java.util.Scanner;

public class MyUtil {
    public static Scanner scanner = new Scanner(System.in);
    public static int select = 0;
//    public static int exit = 0;
    public static String gender(){

      do {
          System.out.println("Mời bạn chọn giới tính");
          System.out.println("1.Men");
          System.out.println("2.Women");
          select = Integer.parseInt(scanner.nextLine());
          switch (select){
              case 1:
                  return "Men";
              case 2:
                  return "Women";
          }
        }while (true);

    }

    public static String level(){
        do {
            System.out.println("Mời bạn chọn trình độ");
            System.out.println("1.Trung cấp");
            System.out.println("2.Cao Đẳng");
            System.out.println("3.Đại học");
            System.out.println("4.Sau đại học");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                   return "Intermediate";
                case 2:
                    return "College";
                case 3:
                    return "University";
                case 4:
                    return "After university";
            }
        }while (true);
    }
    public static String location(){
        do {
            System.out.println("Mời bạn chọn vị trí");
            System.out.println("1.Receptionist");
            System.out.println("2.Serve");
            System.out.println("3.Expert");
            System.out.println("4.Monitor");
            System.out.println("5.Manage");
            System.out.println("6.Manager");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    return "Receptionist";
                case 2:
                    return "Serve";
                case 3:
                    return "Expert";
                case 4:
                    return "Monitor";
                case 5:
                    return "Manage";
                case 6:
                    return "Manager";
            }

        }while (true);
    }

    //   public Employee(int id, String name, String gender, int CMND, int phone, String email, String level, String location) {
    //        super(id, name, gender, CMND, phone, email);

    public static void editPersonById(Employee employee){
       do {
           System.out.println("1.Bạn muốn sửa tên");
           System.out.println("2.Bạn muốn sửa giới tính");
           System.out.println("3.Bạn muốn sửa CMND");
           System.out.println("4.Bạn muốn sửa số điện thoại");
           System.out.println("5.Bạn muốn sửa email");
           System.out.println("6.Bạn muốn sửa trình độ");
           System.out.println("7.Bạn muốn sửa vị trí");
           System.out.println("8.Bạn muốn sửa lương");
           System.out.println("9.Finish");

           System.out.println("Mời bạn chọn:");
           select = Integer.parseInt(scanner.nextLine());

           switch (select){
               case 1:
                   System.out.println("Mời bạn sửa tên ");
                   String nameEdit = scanner.nextLine();
                   employee.setName(nameEdit);
                   break;
               case 2:
                   System.out.println("Mời bạn sửa giới tính");
                   String genderEdit = MyUtil.gender();
                   employee.setGender(genderEdit);
                   break;
               case 3:
                   System.out.println("Mời bạn sửa CMND");
                   int cmndEdit = Integer.parseInt(scanner.nextLine());
                   employee.setCMND(cmndEdit);
                   break;
               case 4:
                   System.out.println("Mời bạn sửa số điện thoại");
                   int phoneEdit = Integer.parseInt(scanner.nextLine());
                   employee.setPhone(phoneEdit);
                   break;
               case 5:
                   System.out.println("Mời bạn sửa email");
                   String emailEdit = scanner.nextLine();
                   employee.setEmail(emailEdit);
                   break;
               case 6:
                   System.out.println("Mời bạn sửa trình độ");
                   String levelEdit = MyUtil.level();
                   employee.setLevel(levelEdit);
                   break;
               case 7:
                   System.out.println("Mời bạn sửa vị trí");
                   String location = MyUtil.location();
                   employee.setLocation(location);
                   break;
               case 8:
                   System.out.println("Mời bạn sửa lương");
                   long wage = Long.parseLong(scanner.nextLine());
                   employee.setWage(wage);
                   break;
               case 9:
                   break;


           }

       }while (select < 9);
    }

    public static boolean checkId(int id , List<Integer> ids){
        return ids.contains(id);
    }

    public static String typeOfGuest(){
        do {
            System.out.println("1.Diamond");
            System.out.println("2.Platium");
            System.out.println("3.Gold");
            System.out.println("4.Silver");
            System.out.println("5.Member");

            System.out.println("Mời bạn chọn:");
            select = Integer.parseInt(scanner.nextLine());

            switch (select){
                case 1:
                    return "Diamond";
                case 2:
                    return "Platium";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
            }
        }while (true);
    }


    //   public Customer(int id, String name, String birthday, String gender, int CMND, int phone, String email, String typeOfGuest, String address) {
//        super(id, name, birthday, gender, CMND, phone, email);
    public static void editCustomerByCmnd(Customer customer){
        do {
            System.out.println("1.Nhập tên khách hàng bạn muốn sửa");
            System.out.println("2.Nhập birthday khách hàng bạn muốn sửa");
            System.out.println("3.Nhập giới tính khách hàng bạn muốn sửa");
            System.out.println("4.Nhập số điện thoại khách hàng bạn muốn sửa");
            System.out.println("5.Nhập email khách hàng bạn muốn sửa");
            System.out.println("6.Nhập loại khách hàng bạn muốn sửa");
            System.out.println("7.Nhập địa chỉ khách hàng bạn muốn sửa");
            System.out.println("8.Finish");

            System.out.println("Mời bạn chọn:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    System.out.println("Mời bạn sửa tên");
                    String nameCustomer = scanner.nextLine();
                    customer.setName(nameCustomer);
                    break;
                case 2:
                    System.out.println("Mời bạn sửa ngày sinh");
                    String birthdayCustomer = scanner.nextLine();
                    customer.setBirthday(birthdayCustomer);
                    break;
                case 3:
                    System.out.println("Mời bạn sửa giới tính");
                    String genderCustomer = MyUtil.gender();
                    customer.setGender(genderCustomer);
                    break;
                case 4:
                    System.out.println("Mời bạn sửa số điện thoại");
                    int phoneCustomer = Integer.parseInt(scanner.nextLine());
                    customer.setPhone(phoneCustomer);
                    break;
                case 5:
                    System.out.println("Mời bạn sửa email");
                    String emailCustomer = scanner.nextLine();
                    customer.setEmail(emailCustomer);
                    break;
                case 6:
                    System.out.println("Mời bạn sửa loại khách hàng");
                    String typeOfGuest = MyUtil.typeOfGuest();
                    customer.setTypeOfGuest(typeOfGuest);
                    break;
                case 7:
                    System.out.println("Mời bạn sửa địa chỉ khách hàng");
                    String addressCustomer = scanner.nextLine();
                    customer.setAddress(addressCustomer);
                    break;
                case 8:
                    break;
            }
        }while (select < 8);
    }

    public static boolean checkCmnd(int cmnd,List<Long> cmnds){
        return cmnds.contains(cmnd);
    }




}
