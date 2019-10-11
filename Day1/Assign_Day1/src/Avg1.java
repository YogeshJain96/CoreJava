// 1. Accept any numbers as command line arguments from user. If user supplies
// less than 2 arguments supply error message & terminate. If  correct,
// compute average & display the same. (args.length = to find array size 
// Double.parseDouble(s) for parsing double values)

class Avg1{
	public static void main(String args[]){
		if(args.length<2){
			System.out.println("Enter atleast two Arguments");
			return;
		}
		else
		{
			Double sum=0.0;
			for(int i=0;i<args.length;i++){
				//sum=sum+args[i];
				sum+=Double.parseDouble(args[i]);
			}
			System.out.println("Average = "+(sum/args.length));

		}
	}
}