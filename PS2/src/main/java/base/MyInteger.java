package base;

public class MyInteger {
	
	private int iValue;
	
	public MyInteger(int i){
		iValue=i;
	}
	
	public int getiValue(){
		return iValue;
	}
	
	// first set
	public boolean isEven(){
	
		return (iValue%2==0?true:false);
	}
	
	public boolean isOdd(){
		
		return (iValue%3==0?true:false);
	}
	
	public boolean isPrime(){
		if (iValue>2){
			for (int i=2;i<=iValue/2;i++){
				if (iValue%i==0){
					return false;
				}	
			}
		}
		return true;
		
	}
	
	
	
	// second set
	public static boolean isEven(int i){
		return (i%2==0?true:false);
	}
	public static boolean isOdd(int i){
		return (i%3==0?true:false);
	}
	
	public static boolean isPrime(int i){
		
		if (i>2){
			for (int d=2;d<=i/2;d++){
				if (i%d==0){
					return false;
				}	
			}
		}
		return true;
		
	}
	// third set
	public static boolean isEven(MyInteger i){
		return i.isEven();	
	}
	
	public static boolean isOdd(MyInteger i){
		return i.isOdd();
	}
	public static boolean isPrime(MyInteger i){
		if (i.iValue>2){
			for (int d=2;d<=i.iValue/2;d++){
				if (i.iValue%d==0){
					return false;
				}	
			}
		}
		return true;
		
	}
	
	//Method equrals
	public boolean equals(int i){
		return (i==iValue?true:false);
	}
	public boolean equals(MyInteger i){
		return (i.equals(iValue));
		}
}
			

