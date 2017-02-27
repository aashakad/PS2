package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public boolean isEven() {
		if (this.iValue%2==0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd(){
		if (this.iValue%2!=0)
			return true;
		else
			return false;
	}
	
	public boolean isPrime(){
		int i;
		int flag = 0;
		for(i = 2; i < this.iValue; i++)
			if (this.iValue%i == 0)
				flag = 1;
		if (flag == 1)
			return false;
		else 
			return true;
	}
	
	public static boolean isEven(int n) {
		if (n%2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int n){
		if (n%2 != 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int n){
		int i;
		int flag = 0;
		for(i = 2; i < n; i++)
			if (n % i == 0)
				flag = 1;
		if (flag == 1)
			return false;
		else 
			return true;
	}
	
	public static boolean isEven(MyInteger m) {
		if (m.iValue%2==0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(MyInteger m){
		if (m.iValue%2!=0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(MyInteger m){
		int i;
		int flag = 0;
		for(i = 2; i < m.iValue; i++)
			if (m.iValue%i == 0)
				flag = 1;
		if (flag==1)
			return false;
		else 
			return true;
	}
	
	public boolean equals(int n) {
		if (this.iValue == n)
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger m){
		if (this.iValue == m.iValue)
			return true;
		else
			return false;
	}
}
