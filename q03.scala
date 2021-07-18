import java.util.Scanner;
import scala.io.StdIn.readInt;

object q03{


	def addNumber(n:Int,i:Int=0): Int=n match{
		case 0 =>i
		case x if x>0 => addNumber((n-1),(i+n))
   	}

	
	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Get addition of numbers from 1 to i\n");
		print("Enter number :");
		val num=input.nextInt();

		println(addNumber(num));	
	}
}

