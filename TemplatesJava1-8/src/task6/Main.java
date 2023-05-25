package task6;
import task6.Builder.Person;
import task6.FabricMethod.Processor;
import task6.FabricMethod.ProcessorFabric;
import task6.FabricMethod.ProcessorTypes;
import task6.Prototype.Human;

import static task6.FabricMethod.ProcessorTypes.I5;

public class Main {
    public static void main(String[] args) {
        ProcessorFabric factory = new ProcessorFabric();

        Processor i5 = factory.getProcessor(I5);
        Processor i7 = factory.getProcessor(ProcessorTypes.I7);
        Processor i9 = factory.getProcessor(ProcessorTypes.I9);

        i5.calculate();
        i7.calculate();
        i9.calculate();

        Person myPerson = new Person.Builder()
                .withName("Jane")
                .withSurname("Doe")
                .withAge(32)
                .withHeight(165)
                .withWeight(70)
                .build();
        Human human1 = new Human("Erwan", "Haaland", 30);
        Human human2 = (Human) human1.getClone();
    }
}

