import java.util.Scanner;
import scala.io.StdIn.readInt;

object q04{

	def isEven(n:Int): Boolean=n match{
       case 0 => true
		   case _ => isOdd(n-1)
   	}
	
	def isOdd(n:Int): Boolean={
     		! (isEven(n)) 
   	}
	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Enter a number :");
		val num=input.nextInt();

		if(isOdd(num))
			println("Odd");
		else
			println("Even");
	}
}

object isEven extends App {
  
    val a = scala.io.StdIn.readInt()
    if(isEven(a)){println("Even")}else {println("not even")}
    if(isOdd(a)){println("Odd")}else {println("not odd")}
    
  
  def isEven(i:Int):Boolean = i match{
    case 0 => true
    case _ => isOdd(i-1)
  }
  
  def isOdd(i:Int) : Boolean = !(isEven(i))
}