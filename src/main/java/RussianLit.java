import java.util.ArrayList;
import java.util.Scanner;

public class RussianLit {


    String title;
    String author;
    String comment;
//    ArrayList<> Books;



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("what comment do you want to make?");
        String comment = sc.nextLine();
        sc.close();
        System.out.println(comment);
    }

}
