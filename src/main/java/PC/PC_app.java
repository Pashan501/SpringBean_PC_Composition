package PC;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PC_app {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PC_Config.class);

        PC pc = context.getBean(PC.class);
        pc.getVideoCard();
        System.out.println("10 minutes later...");
        pc.pcOFF();
    }


}
