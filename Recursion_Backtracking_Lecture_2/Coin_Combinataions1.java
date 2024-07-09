package Recursion_Backtracking_Lecture_2;
import java.util.List;
import java.util.ArrayList;
public class Coin_Combinataions1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []coin= {2,1,3,5};
        int amount=4;
        List<Integer>ll=new ArrayList<>();
        combinataions(coin,amount,ll,0);
	}
	public static void combinataions(int[]coin,int amount,List<Integer>ll,int idx) {
		if(amount==0) {
			System.out.println(ll);
			return;
		}
		for(int i=idx;i<coin.length;i++) {
			if(amount>=coin[i]) {
				ll.add(coin[i]);
				combinataions(coin,amount-coin[i],ll,i);
				
			}
		}
}
}