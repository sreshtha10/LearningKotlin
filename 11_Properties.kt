// Properties in Kotlin 

// Read only and Mutable Properties:
// property = field + accessor(s)
// val = field + getter
// var  = field + getter + setter


class Contact(
	val name:String,
    var address: String
)

fun main(){
	val contact = Contact("Sreshtha","Varanasi")
    contact.address = "..." // same as contact.setAddress(); in JAVA
    println(contact.address)  // same as contact.getAddress(); in JAVA
    
    
}
