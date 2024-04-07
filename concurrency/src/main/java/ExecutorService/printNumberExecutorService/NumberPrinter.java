package ExecutorService.printNumberExecutorService;

public class NumberPrinter implements Runnable{
    int i;
    public NumberPrinter(int i){
        this.i = i;
    }
    @Override
    public void run(){
        System.out.println("Number: " + i + " in Thread" + Thread.currentThread().getName());
    }
}
