// interfaces

class Person(val firstName:String,val lastName:String)

interface PersonInfoProvider{
    val providerInfo:String
    
    fun printInfo(person:Person){
        // default implementation
     	println(providerInfo)
     
    }
}



interface SessionInfoProvider{
    fun getSessionId():String
}

// multiple interfaces

class BasicInfoProvider:PersonInfoProvider,SessionInfoProvider{
	// overriding properties
	override val providerInfo:String
    	get() = "BasicInfoProvider"
    
    // overriding methods
    
    override fun printInfo(person:Person){
        super.printInfo(person)
    }
    
    override fun getSessionId() = "123"
}


fun main(){
	val provider = BasicInfoProvider()
    provider.printInfo(Person("Sreshtha","Mehrotra"))
    println(provider.getSessionId())
    checkTypes(provider)
}




// Casting and type checks
fun checkTypes(infoProvider:PersonInfoProvider){
    if(infoProvider !is SessionInfoProvider){
        println("not a session info provider")
    }
    else{
        println("Is a session info provider")
        (infoProvider as SessionInfoProvider).getSessionId() // manual casting
        infoProvider.getSessionId()  // compiler does the smart casting
    }
}
