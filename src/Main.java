import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);


      Phone phone1=new Phone("Samsung",64,new BigDecimal(50000));
      Phone phone2=new Phone("Iphone",124,new BigDecimal(100000));
      Phone phone3=new Phone("Redmi",32,new BigDecimal(40000));



     Employee employee1=new Employee("Adam",new BigDecimal(500000), LocalDate.of(2000,10,20),
             new ArrayList<>(List.of(phone1)),Gender.MALE);
     Employee employee2=new Employee("Aktan",new BigDecimal(1500000), LocalDate.of(2002,5,20),
             new ArrayList<>(List.of(phone2)),Gender.MALE);
     Employee employee3=new Employee("Akylai",new BigDecimal(500000), LocalDate.of(2003,7,20),
             new ArrayList<>(List.of(phone3)),Gender.FEMALE);
     List<Employee>employees=new ArrayList<>(List.of(employee1,employee2,employee3));

        EmployeeServiceImpl employeeServiceImple = new EmployeeServiceImpl();



        while (true) {
            System.out.println("""
                        1 Creat!
                        2 Remove employee!
                        2 FIND BY NAME!
                        4 Remove Gender! 
                        5 Find By Phone!
                        !""");
            System.out.println("san beriniz:");
            int number= scanner.nextInt();
            switch (number){
                case 1:
                    System.out.println(employeeServiceImple.create(employees));
                    break;
                case 2:
                    String name4 = scanner.nextLine();
                    System.out.print("Remove employee : ");
                    System.out.println(employeeServiceImple.removeEmployee(scanner.nextLine(), employees));
                case 3:
                    String word = scanner.nextLine();
                    System.out.print("Find by Name : ");
                    System.out.println(employeeServiceImple.findByName(scanner.nextLine(), employees));
                    System.out.println(employeeServiceImple.findAll());
                case 4:
                    String n = scanner.nextLine();
                    System.out.print("REMOVE Gender : ");
                    System.out.println(employeeServiceImple.removeEmployeeGender(scanner.nextLine(), employees));
                    System.out.println(employeeServiceImple.findAll());
                case 5:
                    String na = scanner.nextLine();
                    System.out.print("FIND BY Phone  : ");
                    System.out.println(employeeServiceImple.findPhoneEmployee(scanner.nextLine(), employees));
                    break;
                default:
                    System.out.println("YOU ENTERED A WRONG COMBINATION!!!");
                    break;



            }
        }

    }
}