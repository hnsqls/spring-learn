import com.ls.aop.CatAop;
import com.ls.config.MainConfig;
import com.ls.pojo.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Cat bean = context.getBean(Cat.class);
        bean.action("睡觉~");
    }
}
