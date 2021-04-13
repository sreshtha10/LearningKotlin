// Properties in Kotlin 

// Read only and Mutable Properties:
// property = field + accessor(s)
// val = field + getter
// var  = field + getter + setter



class Computer{
    // properties must be initialized otherwise lateinit keyword
    // val - getter 
    // var - setter + getter
    var cost = 500f
    val name = "The best computer"
    
    lateinit var currentUser :String
    
    val isExpensive:Boolean
    	get() = cost > 1000f
    
    
    //backing fields
    var properties = " "
    	set(value){
            field = value
            println("Properties were changed.")
        }
        
  	/* why backing fields?
  	 * if we define a setter like set(value) {cost = value}
  	 * It will throw a stackOverflow Error because setter is called recursively inside
  	 * the setter defination. Therefore, we need backing fields to implement setters.
  	 */
     
    // we can use access modifiers with getters and setters.
    var id = 10
    	private set
    
}



class Contact(
	val name:String,
    var address: String
)

fun main(){
    val contact = Contact("Sreshtha","Varanasi")
    contact.address = "..." // same as contact.setAddress(); in JAVA
    println(contact.address)  // same as contact.getAddress(); in JAVA
    
    val myComputer = Computer()
    // lateinit property must be set before using else there will be CTE
    myComputer.currentUser = "Sreshtha"
    println("${myComputer.cost}  ${myComputer.name} ${myComputer.currentUser}")
    // myComputer.id  = 11 will throw CTE because setter is private.
    
}
