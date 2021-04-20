import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        String str = cs.nextLine();
        String[] list = str.split(" ");
        System.out.print(list[list.length-1].length());
    }
}
