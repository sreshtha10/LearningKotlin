// while and do while are exactly same

fun main(){
    val map = mapOf(
        1 to "a",
        2 to "b"
    )
    
    for((key,value) in map){
        println("$key = $value")
    }
    
 	val list = listOf("a","b","c")
    
    for((index,element) in list.withIndex()){
        println("$index : $element")
    }
    
    for(i in 1..9){
        print(i)
    }
    
    println()
     
    for(i in 1 until 9){
        print(i)
    }
    
    println() 
    
    for(i in 9 downTo 1 step 2){
        print(i)
    }
    
    println()
    
    for(ch in "abc"){
        print(ch+1)
    }
    
    println()
    
    for(ch in '0' until '9'){
        print(ch)
    }
    println()
    // 'in' checks and ranges
    
    // 'in' can be used for two purposes : 1. iteration and 2. check for belonging
    println(isLetter('A'))
    println(isNotDigit('X'))
    println(recognize('1'))
    
    println("Kotlin" in "Java".."Scala") // Strings are compared lexicographically
    
    
    // range of custom types
    // if (myDate in startDate..endDate)
    
    
}


fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'


fun isNotDigit(c:Char) = c !in '0'..'9'


// 'in' as when-condition

fun recognize(c:Char):String = when(c){
    in '0'..'9' -> "It is a digit"
    in 'a'..'z', in 'A'..'Z' -> "It is a letter" // can't use || here
    else -> "I don't know"
}
