package Demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class TestMain {
    public static void main(String[] args) {
        //Load Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //Retrieve Bean from Spring container
        CricketCoach criccoach = context.getBean("myCricketCoach", CricketCoach.class);
        //call methods on bean
        System.out.println(criccoach.getDailyFortune());
        System.out.println(criccoach.getDalyWorkout());
        //call our new method to get the literal values
        System.out.println(criccoach.getEmailaddres());
        System.out.println(criccoach.getTeam());
        //close the context
            context.close();
        System.out.println(System.getProperty("user.dir"));
    }
    }

