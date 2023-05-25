package ru.agcon.task10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.agcon.task10.components.ConsolePrinter;
import ru.agcon.task10.components.FilePrinter;
import ru.agcon.task10.interfaces.Printer;

@Configuration
public class BeanConfig {

    @Bean(name = "console")
    public Printer consolePrinter(){
        return new ConsolePrinter();
    }

    @Bean(name = "file")
    public Printer filePrinter(){
        return new FilePrinter();
    }
}