
fun sayHello(greeting:String, vararg itemsToGreet:String){
    itemsToGreet.forEach {
        itemsToGreet -> println("$greeting $itemsToGreet")
    }
}


// giving default values
fun greetPerson(greeting: String = "Hello",name: String= "John Doe") = println("$greeting $name")


fun main(){
    val things = arrayOf<String>("Kotlin","programming")
    sayHello("Hi","Kotlin","Programming")  //use of vararg
    sayHello("hello",*things)  //spread operator
    greetPerson(name = "Sreshtha",greeting = "Yo")  // can pass argument in any order
    greetPerson()

    //limitations
    sayHello(greeting = "hi",itemsToGreet= *things)
}

