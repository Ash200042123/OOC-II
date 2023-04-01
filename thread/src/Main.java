import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        //int s=5;
        LambdaPrac lambdaPrac= (s)->{
            System.out.println("Hi"+s+"!");
           // return "hi"+s;
        };

        print(lambdaPrac);



//        SimpleArray sharedSimpleArray = new SimpleArray(6);
//
//        Annotation[] ann = sharedSimpleArray.getClass().getDeclaredAnnotations();
//
//        for(Annotation a:ann) System.out.println(a.getClass());
//        ArrayWriter writer1 = new ArrayWriter(1,sharedSimpleArray);
//        ArrayWriter writer2 = new ArrayWriter(11,sharedSimpleArray);
//
//        ExecutorService threadExecutor = Executors.newCachedThreadPool();
//        threadExecutor.execute(writer1);
//        threadExecutor.execute(writer2);
//
//        threadExecutor.shutdown();
//
//        try{
//            boolean taskEnded = threadExecutor.awaitTermination(1, TimeUnit.MINUTES);
//
//            if(taskEnded){
//                System.out.println(sharedSimpleArray);
//            }
//            else{
//                System.out.println("Timed out while waiting for termination");
//            }
//        }
//        catch (InterruptedException ex){
//            ex.printStackTrace();
//        }








//        System.out.println("Creating Threads");
//
//        PrintTask task1 = new PrintTask("task1");
//        PrintTask task2 = new PrintTask("task2");
//        PrintTask task3 = new PrintTask("task3");
//
//        System.out.println("Starting Executor");
//
//        ExecutorService threadExecutor = Executors.newCachedThreadPool();
//        threadExecutor.execute(task1);
//        threadExecutor.execute(task2);
//        threadExecutor.execute(task3);
//
//        threadExecutor.shutdown();
//
//        System.out.println("Tasks started, Main ends");
    }

    static void print(LambdaPrac thing){
        thing.level(5);
    }
}