import com.yangjie.controller.TestController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-*.xml");
        context.start();
        TestController define = (TestController) context.getBean(TestController.class);
        define.show();

    }
}
