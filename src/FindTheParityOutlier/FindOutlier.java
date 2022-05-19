package FindTheParityOutlier;

/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers
except for a single integer N.
Write a method that takes the array as an argument and returns this "outlier" N.
 */

public class FindOutlier {
    static int find(int[] integers) {
        boolean singleIsEven = false;
        boolean singleIsOdd = false;
        boolean anyOdd = false;
        boolean anyEven = false;
        Integer lastOdd = null;
        Integer lastEven = null;
        for (int i = 0; i < integers.length; i++) {
            if (isEven(integers[i])) {
                if (anyEven) {
                    if (anyOdd) {
                        return lastOdd;
                    }
                    singleIsOdd = true;
                    continue;
                } else {
                    if (singleIsEven) {
                        return integers[i];
                    } else {
                        anyEven = true;
                        lastEven = integers[i];
                    }
                }

            }
            else {
                if (anyOdd) {
                    if (anyEven) {
                        return lastEven;
                    }
                    singleIsEven = true;
                    continue;
                } else {
                    if (singleIsOdd) {
                        return integers[i];
                    } else {
                        anyEven = true;
                        lastEven = integers[i];
                    }
                }

            }

        }
        return  lastEven;
    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
