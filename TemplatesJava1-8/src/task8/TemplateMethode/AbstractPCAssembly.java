package task8.TemplateMethode;

public abstract class AbstractPCAssembly {

    abstract void insertCPU();
    abstract void insertGPU();
    abstract void insertRAM();

    public final void assemblyPC(){
        insertCPU();
        insertGPU();
        insertRAM();
        ConnectWires();
    }

    private void ConnectWires(){
        System.out.println("Соединить провода");
    }
}
