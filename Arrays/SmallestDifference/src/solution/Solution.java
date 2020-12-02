package solution;

import java.util.Arrays;

public class Solution {
    public int[] smallestDifference(int[] firstArr, int[] secondArr) {
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        int firstIndex = 0;
        int secondIndex = 0;

        int min = Integer.MAX_VALUE;
        int firstResultNumber = 0;
        int secondResultNumber = 0;

        while (firstIndex < firstArr.length && secondIndex < secondArr.length) {
            int difference = Math.abs(firstArr[firstIndex] - secondArr[secondIndex]);
            if (difference < min) {
                min = difference;
                firstResultNumber = firstArr[firstIndex];
                secondResultNumber = secondArr[secondIndex];
            }

            if (firstArr[firstIndex] < secondArr[secondIndex]) {
                firstIndex++;
            } else {
                secondIndex++;
            }
        }
        return new int[] {firstResultNumber, secondResultNumber};
    }
}
