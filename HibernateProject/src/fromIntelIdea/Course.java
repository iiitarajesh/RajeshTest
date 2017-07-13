package fromIntelIdea;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by IBM_ADMIN on 1/14/2017.
 */
@Entity
@Table(name="COURSE")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE ,  region = "COURSE")
public class Course {
    private long courseId;
    private String courseName;

    public Course(){}

    public Course(long courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    @Id
    @GeneratedValue
    @Column(name = "COURSE_ID")
    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    @Column(name="COURSE_NAME" , nullable = false)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
