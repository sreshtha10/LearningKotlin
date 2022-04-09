//EXTENSION FUNCTIONS

// Int.to() or Int to
// String.joinToString() includes separator, postfix,prefix
// Char.isLetter()
// Char.isLetterOrDigit()
// Array.getOrNull() or List.getOrNull()
// List.withIndex() 
// until or until()
// """   To code or 
//           not to code """.trimMargin() or .trimIndent()
 
// String.toRegex()
// String.toInt() - NumberFormatException
// String.toDouble()
// String.toIntOrNull()

// eq - if equals OK else Error

// eg - 'a' to 1.0 is Pair<Char,Double>

// creating extension function : fun ClassName.functionName(): ReturnType {}



// Extensions are static Java functions under the hood,
// therefore there is no override for extension functions in Kotlin


// if we declare an extension function with same name as member function, member will be called
/* for eg:
 * fun String.get(index:Int) = "*"
 * 
 * fun main(args: Array<String>){
 * 		println("abc".get(1))
 * }
 * 
 * b will be printed instead of * because member always preceeds
 */

// Although extensions can be overloaded.
fun main(args: Array<String>) {
    //kotlin extension functions
    fun Circle.perimeter():Double{
        return 2*Math.PI*radius
    }
    
    val c1 = Circle(2.5)
    println(c1.area())
    println(c1.perimeter())
}


class Circle(val radius:Double){
    fun area():Double{
        return Math.PI*radius*radius
    }
}


