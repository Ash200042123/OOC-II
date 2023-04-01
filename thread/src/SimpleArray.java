import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Random;

public class SimpleArray {
    private final int array[];
    private int writeIndex=0;
    private final static Random generator = new Random();
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
@interface Nm{
    String m() default "none";
}
    public SimpleArray(int size) {
        array = new int[size];
    }

    public synchronized void add(int value){
        int position = writeIndex;

        try{
            Thread.sleep(500);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        array[position] = value;
        System.out.printf("%s wrote %2d to element %d.\n", Thread.currentThread().getName(),value,position);

        ++writeIndex;
        System.out.printf("New write index is %d\n",writeIndex);
    }
    @Nm
    public String toString(){

        String string = "\nContents of SimpleArray:\n";

        for(int i=0;i<array.length;i++){
            string+= array[i] +" ";
        }
        return string;
    }
}
