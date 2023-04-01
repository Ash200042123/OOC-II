import java.util.Scanner;

 enum ErrorCode{
    C_400("C_400"),
    C_401("C_401"),
    C_403("C_403"),
    C_404("C_404"),
    C_408("C_408");

    public String err_code;
    public String meaning;

    ErrorCode(String x){
        this.err_code=x;

        switch (x) {
            case "C_400":
                this.meaning = "Bad Request";
                break;
            case "C_401":
                this.meaning = "Unauthorized";
                break;
            case "C_403":
                this.meaning = "Forbidden";
                break;
            case "C_404":
                this.meaning = "Not Found";
                break;
            case "C_408":
                this.meaning = "Request Timeout";
                break;
            default:
                this.meaning = "Invalid code";
                break;
        }
    }
    String GetMeaning(){
        return this.meaning;
    }
}
//class ErrorCodes{
//
//    String codes;
//    String meaning;
//
//      public ErrorCodes(String x) {
//          this.codes = x;
//
//          switch (x) {
//              case "C_400":
//                  this.meaning = "Bad Request";
//                  break;
//              case "C_401":
//                  this.meaning = "Unauthorized";
//                  break;
//              case "C_403":
//                  this.meaning = "Forbidden";
//                  break;
//              case "C_404":
//                  this.meaning = "Not Found";
//                  break;
//              case "C_408":
//                  this.meaning = "Request Timeout";
//                  break;
//              default:
//                  this.meaning = "Invalid code";
//                  break;
//
//          }
//      }
//      public String GetMeaning(){
//          return this.meaning;
//      }
//}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String y = in.next();

        ErrorCode err= ErrorCode.valueOf(y);
        System.out.println(err.GetMeaning());
    }
}