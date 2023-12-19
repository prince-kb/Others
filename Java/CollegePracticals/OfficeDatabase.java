/*
Write a program to maintian an office database using inheritance.Superclass is the employee that contain all the information as follows : 
Emp-code, Emp_name, Address, PhoneNo, DA-10%, HRA-20%. 
The inheritance properties held by the problem are follows :
Teaching class contains own attributes subject specialization, designation, office and,
Faculty class has another attribute called research area, and
Technical class has another attribute called tech expert area.
Create all the lowest level classes, each classes having their own basic pay. Implement the inheritance concept of the above figure and calculate the salary statement for each figure
*/

import java.util.Scanner;

class Employee{
    String emp_name,add,p_no;
    int emp_code;
    double salary,da,hra;
    public Employee(int emp_code,String emp_name,String add,String p_no,double salary){
        this.emp_name=emp_name;
        this.emp_code=emp_code;
        this.add=add;
        this.p_no=p_no;
        this.salary=salary;
        this.da=0.1*salary;
        this.hra=0.2*salary;
    }
    public double basicSalary(){
        return salary + da + hra;
    }
}

class Teaching extends Employee{
    String sub_spec,designation,office;
    public Teaching(int emp_code,String emp_name,String add,String p_no,double salary,String sub_spec,String designation, String office){
        super(emp_code,emp_name,add,p_no,salary);
        this.sub_spec=sub_spec;
        this.designation=designation;
        this.office=office;
    }
}

class Faculty extends Teaching{
    String res_area;
    public Faculty(int emp_code,String emp_name,String add,String p_no,double salary,String sub_spec,String designation, String office, String res_area){
        super(emp_code,emp_name,add,p_no,salary,sub_spec,designation,office);
        this.res_area=res_area;
    }
}
class Technical extends Teaching{
    String tech_expert_area;
    public Technical(int emp_code,String emp_name,String add,String p_no,double salary,String sub_spec,String designation, String office, String tech_expert_area){
        super(emp_code,emp_name,add,p_no,salary,sub_spec,designation,office);
        this.tech_expert_area=tech_expert_area;
    }
}

public class OfficeDatabase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of employees : ");
        int n=scan.nextInt();
        Employee employee[] = new Employee[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter employee type (1: Teaching 2: Faculty)");
            int a = scan.nextInt();
            System.out.println("Enter employee code : ");
            int emp_code = scan.nextInt();
            System.out.println("Enter employee name : ");
            String emp_name = scan.nextLine();
            System.out.println("Enter employee address : ");
            String add = scan.nextLine();
            System.out.println("Enter employee phone number : ");
            String p_no = scan.nextLine();
            System.out.println("Enter employee basic salary : ");
            double salary = scan.nextInt();
            switch(a){
                case 1:
                System.out.println("Enter subject specialization : ");
            }
        }
    }
}