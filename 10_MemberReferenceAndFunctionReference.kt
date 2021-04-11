// member reference and function reference
// member reference is same as of JAVA

class Person(val name:String,val age:Int){
    fun isOlder(ageLimit: Int):Boolean = age > ageLimit
}

fun isEven(i:Int):Boolean = i%2 == 0

fun main(){
    // function reference
	val predicate = ::isEven  
    // same as
    // val predicate = {i:Int -> isEven(i)}
    
    // bound and non-bound reference
    
    // Non-Bound example
    val agePredicate : (Person,Int) -> Boolean = Person::isOlder 
    val alice = Person("Alice",29)
    println(agePredicate(alice,21))
    
    // Bound example
    val agePredicateBound: (Int) -> Boolean = alice::isOlder
	println(agePredicateBound(21))    
    
    
    
}
