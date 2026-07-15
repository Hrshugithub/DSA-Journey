package StringRecursion;
import java.util.*;
public class StartsWith {
    static void main() {
        System.out.println(RemoveApple("abcappappleaa"));
        System.out.println(RemoveAppNotApple("abcappappleaa"));
    }
    static String RemoveApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return RemoveApple(s.substring(5    ));
        }
        else{
           return  s.charAt(0) +RemoveApple(s.substring(1));
        }
    }static String RemoveAppNotApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(!s.startsWith("apple")&&s.startsWith("app")){
            return RemoveAppNotApple(s.substring(3    ));
        }
        else{
           return  s.charAt(0) +RemoveAppNotApple(s.substring(1));
        }
    }
}
