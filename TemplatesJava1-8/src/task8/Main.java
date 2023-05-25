package task8;

import task8.TemplateMethode.*;
import task8.Visitor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("WeakComputer");
        AbstractPCAssembly weakComputer = new WeakComputer();
        weakComputer.assemblyPC();

        System.out.println("MiddleComputer");
        AbstractPCAssembly middleComputer = new MiddleComputer();
        middleComputer.assemblyPC();

        System.out.println("PowerfulComputer");
        AbstractPCAssembly powerfulComputer = new PowerfulComputer();
        powerfulComputer.assemblyPC();


        Point p1 = new Point2d(1, 2);
        Visitor v1 = new Euclid();
        p1.accept(v1);
        System.out.println("Расстояние до точки:" + p1.getMetric());

        Point p2 = new Point3d(1, 2, 3);
        Visitor v2 = new Euclid();
        p2.accept(v2);
        System.out.println("Расстояние до точки:" + p2.getMetric());
    }
}
