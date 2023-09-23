 class Person {
 private String name;
 private String address;

    public Person() {

    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Employee extends Person {

    private int employeeId;
    private String department;

    public Employee() {

    }

    public Employee(String name, String address, int employeeId) {
        super(name, address);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", department='" + department + '\'' +
                '}'+super.toString();
    }
}
// the class which is public should have same as the file
public  class Inheritance{

    public static void main(String[] args) {
        Person p=new Employee();
        p.setName("sumit");
        p.setAddress("agra");

        //p is person we have to downcast to tell compiler that it is the parent clas of employee
        ((Employee)p).setEmployeeId(1);
        ((Employee)p).setDepartment("EE");
        System.out.println(p.toString());
    }

}