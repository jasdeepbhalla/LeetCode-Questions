package Medium;

public class Integer2Roman {

	public static void main(String[] args) {
		
		System.out.println(int2Roman(8));

	}

	public static String int2Roman(int num){

		int [] nums={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4,1};
		String [] digits={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I" };

		StringBuffer sb=new StringBuffer();

		int i=0;

		while(num>0){
			int times=num/nums[i];

			num=num-nums[i]*times;

			for (; times>0; times--){
				sb.append(digits[i]);
			}
			i++;
		}

		return sb.toString();
	}
}
