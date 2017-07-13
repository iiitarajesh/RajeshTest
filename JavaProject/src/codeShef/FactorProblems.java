package codeShef;

import java.util.*;

/**
 * Created by IBM_ADMIN on 12/23/2016.
 */
public class FactorProblems {
    public static void main(String[] args) {
        List<Integer> myOutputList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();
        while (testCase-- > 0) {
            List<Integer> myInputList = new ArrayList<>();
            int values=1;
            int allInput=1;
            int noOfInput = scan.nextInt();
            for (int i = 0; i < noOfInput; i++) {
                 values = scan.nextInt();
                 allInput=allInput*values;
            }
            myOutputList.add(findFactors(allInput).size());
        }
        for (Integer output : myOutputList) {
            System.out.println(output);
        }
    }
    private static Set<Integer> findFactors(Integer myInput) {
        Set<Integer> mySet = new HashSet<>();
            for (int i = 2; i <= myInput / 2; i++) {
                if (myInput % i == 0) {
                    mySet.add(i);
                }
            }
        mySet.add(1);
        mySet.add(myInput);
        return mySet;
    }
}
