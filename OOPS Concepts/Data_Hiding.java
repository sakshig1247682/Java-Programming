

class Employee{
    private int empId;
    private String empName;
    // Here ,we can not access this data into another class , so we decare a public get function ,

    void get(){
        empId = 101;
        empName = "Rahul";
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+empName);
    }
}


public class Data_Hiding{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.get();
       
    }
}


// data-hiding - Outside person can't access aur internal data directly ,this OOP feature nothing but data-hiding , after validation outside person can access  internal data.
// for-EX->   After providing proper username and password ,we can able to our gmail inbox information, by declaring data member variable as private .We can achieve data hiding .
// The main advantage of data hiding is security .It is highly recommonded data member as private.

