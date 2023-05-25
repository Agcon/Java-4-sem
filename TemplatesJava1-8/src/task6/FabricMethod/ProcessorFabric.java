package task6.FabricMethod;

public class ProcessorFabric {
    public  Processor getProcessor(ProcessorTypes type){
        Processor toReturn = null;
        switch (type) {
            case I5:
                toReturn = new i5();
                break;
            case I7:
                toReturn = new i7();
                break;
            case I9:
                toReturn = new i9();
                break;
            default:
                throw new IllegalArgumentException("Wrong Processor type:" + type);
        }
        return toReturn;
    }
}
