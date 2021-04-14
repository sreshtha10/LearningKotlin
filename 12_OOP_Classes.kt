//classes - Basics


// 1. class with default constructor
/*
 * 
class Person{

}

it is same as writing 

class Person() or class Person constructor()
*/


// 2. classes with primary constructors

/* 2a. Initializing using init
 
 
 class Person(_firstName:String,_lastName:String){
 
 	val firstName:String
    val lastName:String
    
    
  	// initializing properties using init block
  	// it is called everytime the reference is used
    init{
    	firstName = _firstName
        lastName = _lastName
    }
 }
 */


/* 2b. Initializing directly
 
 class Person(_firstName:String,_lastName:String){
 	val firstName:String = _firstName
    val lastName:String = _lastName
 }
 
 */

/*3. Declaring properties directly inside the primary constructor

class Person(val firstName:String,val lastName:String)

*/

// 4. Secondary constructors - inside class body
/*
 
 
 	class Person(val firstName:String,val lastName:String){
    
    
    	constructor() this("Peter","Parker")// default value for properties{
        	//body
        }  
        
    }
 
 */
 
 
//  5. Primary constructors with default values
class Person(val firstName:String = "Peter", val lastName:String = "Parker")

fun main(){
    val person1 = Person("Sreshtha","Mehrotra") // no new keyword is there in Kotlin.
    println(person1.firstName)
    val person2 = Person()
    println(person2.firstName)
}

// Note - init is always called before secondary constructor. There can be multiple init blocks which are called in order of their declaration.
