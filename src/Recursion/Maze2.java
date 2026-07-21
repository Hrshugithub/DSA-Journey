package Recursion;

public class Maze2 {
    static void main() {
        boolean[][] maze={
                 {true,true,true}
                ,{true,false,true}
                ,{true,true,true}
                ,{true,true,true}};
        System.out.println(maze("",0,0,maze));
    }
    static int maze(String p,int i,int j,boolean [][] maze) {
        if (i == maze.length-1 && j == maze[0].length-1) {
            System.out.println(p);
            return 1;
        }
        if(!maze[i][j]){
            return 0;
        }
        if (i == maze.length-1) {
            return maze(p + 'R', i, j + 1,maze);
        }
        if (j == maze[0].length-1) {
            return maze(p + 'D', i + 1, j,maze);
        }
        int left = maze(p + 'D', i + 1, j,maze);
        int right = maze(p + 'R', i, j + 1,maze);
        return left + right;
    }
}
