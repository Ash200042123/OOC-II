import java.util.Scanner;

class InvalidFormatException extends Exception{
    public InvalidFormatException(String s){
        super(s);
    }
}

public class Main {
    public static void main(String[] args) throws InvalidFormatException {
        Scanner in = new Scanner(System.in);
        String x= in.next();

        int count=0,flag=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)>=48 && x.charAt(i)<=55 ){
                count++;
            }
        }
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='_'){
                flag=1;
                break;
            }
        }

        if(count<8 && flag==0){
            throw new InvalidFormatException("Not ok");
        }
        else{
            System.out.println("Ok");
        }
    }
}