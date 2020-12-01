package solution;

import java.util.*;

public class Solution {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIndex = 0;
        int seqIndex = 0;

        while (arrIndex < array.size() && seqIndex < sequence.size()) {
            if (array.get(arrIndex) == sequence.get(seqIndex)) {
                seqIndex++;
            }
            arrIndex++;
        }
        return seqIndex == sequence.size();
    }
}
