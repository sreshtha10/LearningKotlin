fun getGreeting(): String{
	return "Hello Kotlin"    
}


//unit is similar means void, main function has also return type unit.
fun sayHello(): Unit{
    println("Say Hello")
}

// single expression function
fun hello() = "Hello Hello"
fun main(){
    println("Hello")
    println(getGreeting())
    sayHello()
    hello()
}


/*fun sayHello(greeting:String ,itemToGreet:String ){
    println("$greeting $itemToGreet")
}
fun main(){
    sayHello("Hey","Sreshtha")
}
*/

