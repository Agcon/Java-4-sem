package ru.agcon.task10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.agcon.task10.config.BeanConfig;
import ru.agcon.task10.interfaces.Printer;

@SpringBootApplication
public class Task10Application {

    public static void main(String[] args) {
        //SpringApplication.run(Task10Application.class, args);
        ApplicationContext context =  new AnnotationConfigApplicationContext(BeanConfig.class);

        String beanName = args[0];
        Printer printer = (Printer) context.getBean(beanName);
        printer.doPrint();
        beanName = args[1];
        printer = (Printer) context.getBean(beanName);
        printer.doPrint();
    }

}
