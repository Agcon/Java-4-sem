package task8.TemplateMethode;

public class PowerfulComputer extends AbstractPCAssembly{

    @Override
    void insertCPU() {
        Processors.insert_i9();
    }

    @Override
    void insertGPU() {
        GraphicCards.insert_4090();
    }

    @Override
    void insertRAM() {
        RAMs.insert_64();
    }

}
