import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese numero");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i <= 12) {
            System.out.println(i);
            i++;
        }



    }
}
