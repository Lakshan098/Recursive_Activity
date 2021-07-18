import java.util.Scanner;
import scala.io.StdIn.readInt;

object q05{


	def addEvenNumber(n:Int):Int{
		if (n<1)
			break;
		sum:Int =0;
		if (n%2==0){ 
			sum=sum+n;
			addEvenNumber(n-2);
			}
		else
			addEvenNumber(n-1);
   	}

	
	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Enter number :");
		val num=input.nextInt();

		println(addEvenNumber(num));	
	}
}