package fromIntelIdea;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IBM_ADMIN on 12/30/2016.
 */
public class EmployeeDetail {
    private Integer employeeId;
    private Employee employee;
    private  String firstName;
    private  String lastName;
    private  String sex;
    private Date birthDate;
    private String Department;

    public EmployeeDetail(){}

    public EmployeeDetail(Integer employeeId, String firstName, String lastName, String sex, Date birthDate, String department) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDate = birthDate;
        Department = department;
    }
    @Id
    @Column(name = "EMPLOYEE_ID",nullable = false,unique = true)
    @GenericGenerator(name = "generator",strategy = "foreign",
            parameters = @Parameter(name="property",value = "employee"))
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @PrimaryKeyJoinColumn
    @OneToOne(fetch = FetchType.LAZY)
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    @Column(name = "FIRST_NAME",nullable = false,length = 30)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name="LAST_NAME",nullable = false,length = 30)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Column(name="SEX",nullable = false,length = 1)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @Column(name="BIRTH_DATE",nullable = false,length = 20)
    @Temporal(value = TemporalType.DATE)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    @Column(name = "DEPARTMENT",length = 20)
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
