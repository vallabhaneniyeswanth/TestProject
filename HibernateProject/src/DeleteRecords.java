import org.hibernate.*;
import org.hibernate.cfg.*;

public class DeleteRecords {
  public static void main(String[] args) 
  {
       Configuration c=new Configuration();
       c.configure("Employee.cfg.xml");
       SessionFactory sf=c.buildSessionFactory();
       Session s=sf.openSession();
       Object obj=s.load(Employee.class,new Integer(100));
       Employee emp=(Employee)obj;
       s.delete(emp);
       Transaction tran=s.beginTransaction();
       tran.commit();
       System.out.println("Record deleted");
       s.close();
       sf.close();
  }

}
//done
