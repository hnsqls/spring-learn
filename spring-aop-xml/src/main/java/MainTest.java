import com.ls.pojo.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//test1. 我们希望在eat前增强，使用AOP添加提示小狗已经3天没吃饭了~，很饿饿饿~~
//test2. 添加一个执行后方法，希望获取eat的参数获做出回应
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Dog dog = context.getBean(Dog.class);
        dog.eat("狗粮");
    }
}
