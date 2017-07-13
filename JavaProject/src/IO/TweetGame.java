package IO;

import java.util.Scanner;

public class TweetGame {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String Line=scan.nextLine();
		String[] spliting=Line.split(" ");
		
		int noOfTweet=Integer.parseInt(spliting[0]);
		int clicks=Integer.parseInt(spliting[1]);
		int[] tweet= new int[noOfTweet];
		for(int j=0;j<noOfTweet;j++)
			tweet[j]=-1;
		for(int i=0;i<clicks;i++){
			String events=scan.nextLine();
			String[] str=events.split(" ");
			if(str[0].equals("CLICK")){
				int tweetno=Integer.parseInt(str[1]);	
				tweet[tweetno-1]=-1*tweet[tweetno-1];
			}
			else if(events.equals("CLOSEALL")){
				for(int j=0;j<noOfTweet;j++)
					tweet[j]=-1;
			}
			int count=0;
			for(int j=0;j<noOfTweet;j++){
				if(tweet[j]==1)
					count++;
				}
			System.out.println(count);
			
		}
	}
}
