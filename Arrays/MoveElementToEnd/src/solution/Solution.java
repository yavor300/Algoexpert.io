package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public Integer[] moveElementToEnd(Integer[] arr, int toMove) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(arr));

        int index = 0;
        int iterator = 0;

        while (iterator < numbers.size()) {
            int element = numbers.get(index);
            if (element == toMove) {
                numbers.remove(index);
                numbers.add(element);
                index--;
            }

            iterator++;
            index++;
        }

        return numbers.toArray(Integer[]::new);
    }
}
