package StringRecursion;

public class SubSeq {
    static void main() {
        sequence("abc","");
    }
    static void sequence(String s,String p){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=s.charAt(0);
        sequence(s.substring(1),p+ch);
        sequence(s.substring(1),p);
    }
}
