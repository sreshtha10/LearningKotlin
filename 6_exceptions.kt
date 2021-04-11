// No difference b/w checked and unchecked exceptions

fun main(){
    val number = 11
    val percentage = 
    	if(number in 0..100)
        	number
    	else
    		throw IllegalArgumentException("Percentage must be b/w 0 and 100 : $number")
            
    
    // try is an expression in Kotlin whereas a statement in Java
    
    val string = "1A"
    val a = try{
        Integer.parseInt(string)
    }
    catch(e: NumberFormatException){
     	null
    }
    
    
    
    // if calling checked exceptions from Java use @Throws annotations else, not needed.
}
