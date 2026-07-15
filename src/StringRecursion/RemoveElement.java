package StringRecursion;

//import static jdk.internal.icu.text.UTF16.charAt;

import java.util.*;
public class RemoveElement {
    static void main() {
        StringBuilder sb = new StringBuilder();
        check("aaabadsva",sb,0);
        System.out.println(sb);
    }
    static void check(String st, StringBuilder sb, int i) {
        if(i>=st.length()){
            return;
        }
        if (st.charAt(i)!='a'){
            sb.append(st.charAt(i));
        }
        check(st,sb,i+1);

    }
}
