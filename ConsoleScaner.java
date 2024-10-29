import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleScaner {

    public static ArrayList<Integer> getDataFromConsole(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = -1;

        while (num != 0) {
            System.out.println("Введите целое число:");
            num = sc.nextInt();
            arrayList.add(num);
        }

        return arrayList;
    }

}
