// OOP

// Class Modifiers  - enum,data


// enum class
// if we write mypackage.Color.* we can directly use these Colors
enum class Color{
    BLUE,ORANGE,RED;
}

// enum class with properties
enum class RGB(val r:Int,val g: Int,val b :Int){
    BLUE(0,0,255),ORANGE(255,165,0),RED(255,0,0);
    
    fun rgb() = (r*256 +g) *256 +b
}



fun getDescription(color:Color):String {
    when(color){
        Color.RED -> return "hot"
        Color.ORANGE -> return "moderate"
        Color.BLUE -> return "cold"
        else -> return "Don't know"
    }
}



// data class - data modifiers generates equals,hashCode,copy,toString and some other extension functions

data class Contact (val name:String,val address:String)

    
    // In JAVA we need string.equals() but in Kotlin we can use  == . Under the hood it calls equals()
    // Triple equals  i.e === checks reference equality for a data class (imp)
    // If the class if not data == will not call .equals() and it will check reference insted of content.

    
    

fun main(){
 	println(getDescription(Color.BLUE)) 
    val contact =Contact("Sreshtha","Varanasi")
    contact.copy(address ="new address")
    println(contact.address)
    

    
}

/*interface Expr
class Num(val value:Int):Expr
class Sum(val left:Expr,val right:Expr):Expr
fun eval(e:Expr):Int = when(e){
    is Num -> e.value
    is Sum -> eval(e.left)+eval(e.right)
}

this will throw a compile time error because the other subclasses may not be present in the same file

to prevent this we can either use exception handling or sealed class modifier

Sealed modifier restricts class hierarchy: all subclasses must be located in the same file
*/

/*
Using Exception handling:

interface Expr
class Num(val value:Int):Expr
class Sum(val left:Expr,val right:Expr):Expr
fun eval(e:Expr):Int = when(e){
    is Num -> e.value
    is Sum -> eval(e.left)+eval(e.right)
    else -> throw IllegalArgumentException("Error")
}

*/



/*
 
 Using sealed 

sealed class Expr
class Num(val value:Int):Expr
class Sum(val left:Expr,val right:Expr):Expr
fun eval(e:Expr):Int = when(e){
    is Num -> e.value
    is Sum -> eval(e.left)+eval(e.right)
}

*/
