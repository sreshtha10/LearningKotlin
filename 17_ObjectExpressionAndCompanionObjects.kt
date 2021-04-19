// inner keyword declares an inner class with reference to the outer class

//Object keyword.


// object = singleton class in java ie the constructor is private
// object expression can also be used for creating annonymous class


interface A{
    fun foo(a:Int)
}


// No static keyword in Kotlin 


// companion object
class B{
    companion object{
        fun show(){
            println("Hello B")
        }
        
        @JvmStatic fun show2(){
            println("Hello B static")
        }
    }

}



fun main(){
    // object expression
    object : A{
        override fun foo(a:Int){
            println("Hello")
        }
    }
    
    
    // actually it is not static but it looks like it. 
    B.show()
    // static for java
    B.show2()
}



