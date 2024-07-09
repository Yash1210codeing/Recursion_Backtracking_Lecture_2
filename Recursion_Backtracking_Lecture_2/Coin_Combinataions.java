package Recursion_Backtracking_Lecture_2;
public class Coin_Combinataions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []coin= {2,1,3,5};
        int amount=4;
        combinataion(coin,amount,"",0);
	}
	public static void combinataion(int[]coin,int amount,String ans,int idx) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<coin.length;i++) {
			if(amount>=coin[i]) {
				combinataion(coin,amount-coin[i],ans+coin[i],i);
			}
		}
	}
}
