package fromIntelIdea;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IBM_ADMIN on 12/26/2016.
 */
public class MixtureProblems {
    public static void main(String[] args) throws IOException {
        List<Integer> myOutputList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        while (testcase-- > 0) {
            String inputString = br.readLine();
            String[] input = inputString.split(" ");
            myOutputList.add(findMixtures(input));
        }
        for (Integer output : myOutputList) {
            System.out.println(output);
        }
    }

    private static Integer findMixtures(String[] strArray) {
        String[] myInput = strArray;
        int fSmoke = 0, y = 0;
        int smoke = 0;
        int resultMix = Integer.parseInt(myInput[0]);
        for (int i = 1; i < myInput.length; i++) {
            if (myInput.length >= 2) {
                y = Integer.parseInt(myInput[i]);
            }
            smoke = resultMix * y;
            resultMix = (resultMix + y) % 100;
            if(smoke>fSmoke){
                fSmoke=smoke;
            }
        }
        return fSmoke;
    }

}
