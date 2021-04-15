// getter and setters


class Person(val firstName:String = "Peter", val lastName:String = "Parker"){
    var nickName:String? = null
    	set(value){  //custom setter
            field = value
            println("New Nickname Set")
        }
        get(){
            println("Value returned")
            return field
        }
}

fun main(){
    val person1 = Person("Sreshtha","Mehrotra") // no new keyword is there in Kotlin.
    println(person1.firstName)
    val person2 = Person()
    println(person2.firstName)
    person1.nickName = "Batman"  // setting values
    val nickNamePerson1 = person1.nickName ?: "no Nickname"   //elvis operator
    
}

// Note - init is always called before secondary constructor. There can be multiple init blocks which are called in order of their declaration.
