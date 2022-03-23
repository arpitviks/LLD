package designpatterns.strategy;

public class Client {

    public static void main(String[] args) {
        OS os = new OS(PageReplacementAlgoType.FIFO);

        FIFOPageReplacementStrategy fifoPageReplacementStrategy
                = new FIFOPageReplacementStrategy(os);

        os.addPage(new Page("14"));
        os.addPage(new Page("2"));
        os.addPage(new Page("3"));

        os.doCleanUp();
    }
}
