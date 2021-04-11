fun main(){
    // function type and lambdas in Kotlin 
   val sum2 :(Int,Int)->Int = {x,y->x+y}
   val isEven : (Int) -> Boolean = {i:Int ->i%2 == 0}
   
   // It is not mandatory to mention the return type and parameter type in lambda
   val sum = {x:Int,y:Int -> x+y}
   
   
   val result : Boolean = isEven(42)
   println(result)
   
   
   val list = listOf(1,2,3,4)
   
   // passing a variable of function type as an argument
   list.any(isEven)
   println(list.filter(isEven));
   
   
   // calling lambda directly
   {println("hey !")}();
   //or better use like this:
   run{println("print using run")}
   
   // lambda with interface.
   val runnable = Runnable{ println(42)}
   
   // val r : ()->Int?  = {} means that the return type is nullable
   // whereas,
   // val r: (()->Int)? = {} means that the variable r is nullable.
   
   // Note -  semicolon in Kotlin is used to separate different statements in a single line.
}
