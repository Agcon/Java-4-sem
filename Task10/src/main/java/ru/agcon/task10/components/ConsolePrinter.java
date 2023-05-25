package ru.agcon.task10.components;

import org.springframework.stereotype.Component;
import ru.agcon.task10.interfaces.Printer;

@Component("console")
public class ConsolePrinter implements Printer {
    @Override
    public void doPrint() {
        System.out.println("I'm ConsolePrinter");
    }
}
