import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ViewRecords {

  public static void main(String[] args) {
       Configuration c=new Configuration();
       c.configure("Employee.cfg.xml");
       SessionFactory sf=c.buildSessionFactory();
       Session s=sf.openSession();
       Object obj=s.load(Employee.class,new Integer(100));
       Employee employee=(Employee)obj;
       System.out.println(employee.getId()+","+employee.getName()+","+employee.getGender()+","+employee.getSalary());
       Transaction tran=s.beginTransaction();
       tran.commit(); 
       s.close();
       sf.close();
  }

}