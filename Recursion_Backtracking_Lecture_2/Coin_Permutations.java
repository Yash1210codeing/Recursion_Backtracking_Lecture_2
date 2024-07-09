package Recursion_Backtracking_Lecture_2;
public class Coin_Permutations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []coin = {2,1,3,5};
        int amount=4;
        permutation(coin,amount,"");
	}
	public static void permutation(int []coin,int amount,String ans) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<coin.length;i++) {
			if(amount>=coin[i]) {
				permutation(coin,amount-coin[i],ans+coin[i]);
			}
		}
	}
}
