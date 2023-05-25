package ru.agcon.task10.components;

import org.springframework.stereotype.Component;
import ru.agcon.task10.interfaces.Printer;
import java.io.*;


@Component("file")
public class FilePrinter implements Printer {
    @Override
    public void doPrint(){
        System.out.println("I'm file writer");
        try(FileWriter writer = new FileWriter("test.txt", false))
        {
            String text = "I'm file writer";
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
