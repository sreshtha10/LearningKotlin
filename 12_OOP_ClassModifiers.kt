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
