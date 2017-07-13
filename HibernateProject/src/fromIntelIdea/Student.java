package fromIntelIdea;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IBM_ADMIN on 1/14/2017.
 */
@Entity
@Table(name = "STUDENT")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY,region = "COURSE")
public class Student {

    private Long studentId;
    private  String studentName;

    private Set<Course> courseSet = new HashSet<>();

    public Student(){}

    public Student(String studentName, Set<Course> courseSet) {
        this.studentName = studentName;
        this.courseSet = courseSet;
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Id
    @GeneratedValue
    @Column(name = "STUDENT_ID" )
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Column(name = "STUDENT_NAME" , nullable = false , length = 100)
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "STUDENT_COURSE", joinColumns = {@JoinColumn(name = "STUDENT_ID")},inverseJoinColumns ={@JoinColumn(name="COURSE_ID")} )
    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }
}
