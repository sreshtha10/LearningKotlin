// control statements
enum class Color{
    BLUE,ORANGE,RED,VOILET,YELLOW,GREEN,INDIGO
}

fun main(){
    val a = 1 
    val b = 2
    val max = if(a >b) a else b  // no ternary operator
    println(max)
    
    println(getDescription(Color.BLUE))
    println(respondToInput("yes"))
    println(mix(Color.RED,Color.YELLOW))
    
    
   
}

fun getDescription(color: Color):String {
    when(color){
        Color.BLUE -> return "cold"
        Color.ORANGE -> return "mild"
        Color.RED -> return "hot"
        else -> return "I don't know"
         // analogous to switch statement. No break though
    }
    return ""
}
    

fun respondToInput(input: String):String{
    when(input){
        "y","yes" -> return "I'm glad you agree"
        "n", "no" -> return "Sorry to hear that"
        else -> return "I don't understand you"
    }
    
}

// an expression can be used as a branch condition
fun mix(c1:Color,c2:Color):Color{
    when(setOf(c1,c2)){
        setOf(Color.RED,Color.YELLOW) -> return Color.ORANGE
        setOf(Color.BLUE,Color.YELLOW) -> return Color.GREEN
        setOf(Color.BLUE,Color.VOILET) -> return Color.INDIGO
        else -> return throw Exception("Dirty color")  
    }   
}




   
