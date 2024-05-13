import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;

public class Test {
    public static void main(String[] args) {
        //读取配置文件
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = applicationContext.getBean("stu", Student.class);
        System.out.println(stu);

    }
}
