package fromIntelIdea;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by IBM_ADMIN on 2/20/2017.
 */
public class Kingdoms {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> myInputList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            int oLine = Integer.parseInt(br.readLine());
            while (oLine-- > 0) {
                String Input = br.readLine();
                String[] inputArray=Input.split("");
                int outPut=findBomb(inputArray);

                myInputList.add(outPut);
            }
        }
        //findBomb(myInputList);

    }

    private static int findBomb(String[] myInput) {

        return 1;
    }
}
