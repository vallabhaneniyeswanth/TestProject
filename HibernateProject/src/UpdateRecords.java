import org.hibernate.cfg.*;
import org.hibernate.*;
public class UpdateRecords {
  public static void main(String[] args) 
   {
   Configuration cfg=new Configuration();
   cfg.configure("Employee.cfg.xml");
   SessionFactory sf=cfg.buildSessionFactory();
   Session s=sf.openSession();
   Employee emp=new Employee(); 
   emp.setId(100);
   emp.setName("YeswanthChowdhary");
   emp.setGender("Male");
   emp.setSalary(100000);
   Transaction txt=s.beginTransaction();
   s.update(emp);
   txt.commit();
   s.close();
   sf.close();
  }
}