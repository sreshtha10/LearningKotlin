// immutable
val name:String = "Mehrotra"

//mutable
var v1: String = "Hello"
// nullable string 
var greet: String? = null

// Kotlin indentify variable type
// therefore we can write like this:
var greet2 = "Hello"

// var greet2 = null is wrong because compiler don't know what type of null it is


fun main(){
    // can't be updated
	val name: String = "Sreshtha"
    println(name+" "+v1+" "+greet2)
    var greeting :String? = null
    if(greeting != null){
        println(greeting)
    }
   	else{
        println("Greeting is null")
    }
    
    greeting = "Yo"
    // when
    when(greeting){
        null -> println("Greeting is null")
        else -> println("hi")
    }
    
    
}

// variables
