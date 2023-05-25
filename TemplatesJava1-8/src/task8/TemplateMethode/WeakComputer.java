package task8.TemplateMethode;

public class WeakComputer extends AbstractPCAssembly{

    @Override
    void insertCPU() {
        Processors.insert_i3();
    }

    @Override
    void insertGPU() {
        GraphicCards.insert_1050ti();
    }

    @Override
    void insertRAM() {
        RAMs.insert_8();
    }

}
