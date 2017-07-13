package fromIntelIdea;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by IBM_ADMIN on 12/28/2016.
 */
@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    private Integer employeeID;
    private String name;
    private double salary;
    private Date version;
    private EmployeeDetail employeeDetail;

    public Employee(Integer employeeID, String name, double salary, Date version) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
        this.version = version;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_ID",nullable = false,unique = true)
    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }


    @Column(name = "EMPLOYEE_NAME",nullable = false,length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "SALARY",nullable = false,precision = 5)
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getVersion() {
        return version;
    }

    public void setVersion(Date version) {
        this.version = version;
    }

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "employee")
    public EmployeeDetail getEmployeeDetail() {
        return employeeDetail;
    }

    public void setEmployeeDetail(EmployeeDetail employeeDetail) {
        this.employeeDetail = employeeDetail;
    }
}
