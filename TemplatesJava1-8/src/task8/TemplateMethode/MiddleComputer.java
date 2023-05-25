package task8.TemplateMethode;

public class MiddleComputer extends AbstractPCAssembly{

    @Override
    void insertCPU() {
        Processors.insert_i5();
    }

    @Override
    void insertGPU() {
        GraphicCards.insert_3070();
    }

    @Override
    void insertRAM() {
        RAMs.insert_32();
    }

}
