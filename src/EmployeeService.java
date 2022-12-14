import java.util.List;

public interface EmployeeService {
    String create(List<Employee> employees);

    String removeEmployee(String name, List<Employee> employees);

    List<Employee> findAll();

    List<Employee> findByName(String name, List<Employee> employees);

    void grouping(List<Employee> employees);

    String removeEmployeeGender(String gender, List<Employee> employees);

    boolean findPhoneEmployee(String phone, List<Employee> employees);

    int getAge(Employee employee);
}
