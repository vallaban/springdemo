package Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansScopeDemoMain {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
        // retrieve bean from the container
    Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDalyWorkout());
        // Close the context
        context.close();
    }
}
