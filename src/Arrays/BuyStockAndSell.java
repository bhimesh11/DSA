package Arrays;



public class BuyStockAndSell {
	
	public static void main(String[] args) {
	int[] arr =  {7, 1, 5, 3, 6, 4};  
	buyStocksell(arr);
	}

	private static void buyStocksell(int[] arr) {
		int minprice = Integer.MAX_VALUE;
		int buyPrice =0;
		int sellprice =0;
		int buyDay =0;
		int sellDay =0;
		int maxProfit =0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<minprice)
			{
				minprice = arr[i];
				buyDay =i+1;
				buyPrice = arr[i];
			}
			int profit = arr[i]-minprice;
			if(profit>maxProfit)
			{
				maxProfit = profit;
				sellDay =i+1;
				sellprice= arr[i];
		}
		}
		System.out.println("Buy at price when stock is " + minprice + " on the day " + buyDay + "\nSell the stock when the price is " + sellprice + " on the day "+ sellDay);
		
	
	}

}
