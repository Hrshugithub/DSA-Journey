package Recursion;

public class Mazeproblem {
    static void main() {
        System.out.println(mazeDiagnol("",0,0));
    }
    static int maze(String p,int i,int j) {
        if (i == 2 && j == 2) {
            System.out.println(p);
            return 1;
        }
        if (i == 2) {
            return maze(p + 'R', i, j + 1);
        }
        if (j == 2) {
            return maze(p + 'D', i + 1, j);
        }
        int left = maze(p + 'D', i + 1, j);
        int right = maze(p + 'R', i, j + 1);
        return left + right;
    }

        static int mazeDiagnol(String p,int i,int j){
        if(i==2&&j==2){
            System.out.println(p);
            return 1;
        }
        if(i==2){
            return maze(p+'R',i,j+1);
        }if(j==2){
            return maze(p+'D',i+1,j);
        }
        int left =mazeDiagnol(p+'D',i+1,j);
        int right =mazeDiagnol(p+'R',i,j+1);
        int diagnol =mazeDiagnol(p+"X",i+1,j+1);
        return left+right+diagnol;
    }
}
