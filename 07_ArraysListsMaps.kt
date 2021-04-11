//arrays, lists and maps

fun main(){
    
    //array
   val a = arrayOf("A","B","C")
   println(a.size)
   println(a[0])
   println(a.get(0))
   
  for(x in a){
      print(x)
  }
  
  println()
  
  a.forEach{ it;String
      println(it)
      
  }
  
  a.forEach{ b->
      println(b)
      
  }
  
  a.forEachIndexed{ index, b ->
      println("$b is at $index")
  }
  
 
 // list
 val c = listOf("D","E","F")
 c.forEach{ d->
     println(d)
 }
 
 
 
 //map
 val map = mapOf(1 to "A", 2 to "B",3 to "C")
 
 map.forEach{ 
     key, value -> println("$key -> $value")
 }
 
// by default collection type is immutable in Kotlin

val map2 = mutableMapOf(1 to "a", 2 to "b")

map2.forEach{
    key,value -> println("$key -> $value")
}

sayHello("Hi",c)

}


fun sayHello(greeting:String, itemsToGreet:List<String>){
    itemsToGreet.forEach{
        a-> println("$greeting $a")
    }
}
