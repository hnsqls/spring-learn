import com.ls.pojo.AutoStu;
import com.ls.pojo.SMap;
import com.ls.pojo.Student;
import com.ls.pojo.StudentList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        AutoStu bean = context.getBean(AutoStu.class);
        System.out.println(bean);
    }
}
