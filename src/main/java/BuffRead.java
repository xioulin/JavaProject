import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffRead {


    public static void main(String[] args) throws IOException {
        BufferedReader bfnr = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter a new string");
        String st = bfnr.readLine();
        System.out.println(st);


    }
}
