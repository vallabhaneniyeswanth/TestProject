import org.hibernate.cfg.*;
import org.hibernate.*;
public class EndUser {
  public static void main(String[] args) 
   {
   Configuration cfg=new Configuration();
   cfg.configure("Employee.cfg.xml");
   SessionFactory sf=cfg.buildSessionFactory();
   Session s=sf.openSession();
   Employee emp=new Employee(); 
   emp.setId(100);
   emp.setName("Yeswanth");
   emp.setGender("Male");
   emp.setSalary(50000);
   Transaction txt=s.beginTransaction();
   s.save(emp);
   txt.commit();
   s.close();
   sf.close();
  }
}