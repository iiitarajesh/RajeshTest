package fromIntelIdea;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IBM_ADMIN on 1/14/2017.
 */
public class myMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();

            Set<Course> courses = new HashSet<Course>();
            courses.add(new Course("Maths"));
            courses.add(new Course("Computer Science"));

            Student student1 = new Student("Eswar", courses);
            Student student2 = new Student("Joe", courses);
            session.save(student1);
            session.save(student2);

            transaction.commit();
        } catch (HibernateException  e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
