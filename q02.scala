object q02{
    def checkPrime(n:Int, i:Int):Boolean={
        if(i == 1) return true
        else if(n%i == 0) return false
        else return prime(n,i-1)
    }
    def primeSeq(a:Int): Unit={
        if(a>2){
            primeSeq(a-1)
        }
        var bool= (checkPrime(a,a/2)); 
		if (bool){
		    println(a);
		  }
    }
    def main(args:Array[String]){
        var n=10
        primeSeq(n)
    }
}