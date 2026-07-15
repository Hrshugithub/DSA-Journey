package StringRecursion;
import java.util.*;
public class RemoveElement_II {
    static void main() {
        String s="aavaavasbaas";
//        skip(s,0);
        s=s.replaceAll("a","");
        System.out.println(s);
    }
//    static void skip(String s,int i){
//        if(i>=s.length()){
//            return;
//        }
//        if(s.charAt(i)=='a'){
//            s=s.replace('a',' ');
//            skip(s,++i);
//        }
    }
//}

