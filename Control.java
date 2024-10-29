import java.util.ArrayList;
import java.util.Collections;

public class Control {

    public static int maxSumNum() {
        ArrayList<Integer> sumNumArray = new ArrayList<>();
        ArrayList<Integer> arrayList = ConsoleScaner.getDataFromConsole();
        for (int num : arrayList){
            int sumNum = String.valueOf(num)
                    .chars()
                    .map(Character::getNumericValue)
                    .sum();
            sumNumArray.add(sumNum);
        }
        return Collections.max(sumNumArray);
    }
}