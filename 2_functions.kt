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

// it is possible to modify an object stored in Val
/*fun main(){
    val lang = mutableListOf("java")
    lang.add("Kotlin")
    for(x in lang){
        println(x)
    }
    
    println(max(1,3))
}*/

// prefer vals to vars


/*
fun max(a:Int, b:Int):Int{
    return if(a>b) a else b
}*/

//fun max(a:Int, b:Int):Int = if(a>b) a else b

// types of functions
// top level  = fun topLevel() =1  (under the hood they are static functions same as Java)
// member function = class A{ fun member() =2}
// local function = fun other(){ fun local() =3}


/*fun main(){
    val listt = listOf('a','b','c')
    println(listt.joinToString(separator = "", prefix = "(", postfix= ")"))
    
    displaySeparator()
}*/

// using default
/*fun displaySeparator(character:Char = '*', size:Int = 10){
    // repeat loop
    repeat(size){
        print(character)
    }
}*/

// in Java we use method overloading for named functions, default parameters etc

