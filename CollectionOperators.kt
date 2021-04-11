/* common operators on collections
filter,count,flatMap,find,map,groupBy,reduce,any, partition,associateby,associate etc.


1. filter - It filters out the content of the list and keeps only their elements that satisfy the given predicate.

2. map - Map transform each element in a collection and stores all the resulting elements in a new list.

3. any - any checks that there is at least one element satisfying the given predicate

4. all - All checks whether all elements satisfy the predicate and none makes sure that none of the elements satisfies the given predicate

5. find - Find finds an element satisfying the given predicate and returns it as a result. If there is no required element, find returns nul

6. firstOrNull - FirstorNull does the same as find, it returns you an element or null as a result. First takes a predicate and throws an exception if no elements satisfying the predicate was found

7. count - Count counts the number of elements that satisfy the given predicate

8. partition - Partition divides the collection into two collections. Filter returns only the elements that satisfy the predicate, and in a sense,
throws out all the elements that don't satisfy the predicate

9. groupBy - If you need to divide your collection into more than two groups, you can use GroupBy. As an argument, you provide the way how to group the elements.

10. associateBy - performs groping, but it returns you one element as the map value.

11. associate -  build a map based on a list. As an argument, you pass allowed to creating the key value pair based on each list element, then associate builds a map by filling in specified keys and values. 

12. zip - It returns you a list of pairs where each pair contains one element from the first list and another element from the second list. If their initial list have different sizes, then the resulting list of pairs will have the length of the shortest list, the remaining elements from the longest list will be ignored

13. zipWithNext - It returns you a list of pairs where each pair consists of neighboring elements is from the initial list

14. flatten - Flatten is an extension function that must be called on a list of lists. It combines all the elements from the nested list and returns you a list of these elements as the result.

15. flatMap - It combines two operations, map and flat. The argument to flatMap must be a lambda that converts each initial element to a list. Here, we first map each string into a list of characters. In the middle layer after applying the first map operations, we have at list of lists

*/


fun main(){
   val list = listOf(1,2,3,4,5,6)
   val filteredList = list.filter(){i -> i%2 == 0}
   println(filteredList)
   
   val mappedList = list.map(){i -> i*i}
   println(mappedList)
   
   val isEven = list.any(){i -> i%2 == 0}
   println(isEven)
   
   val findGreaterThanSix: Int? = list.find(){i -> i>6}
   println(findGreaterThanSix)
   
   val countOdd = list.count(){i -> i%2 != 0}
   println(countOdd)
   
   val (evenList,oddList) = list.partition(){i -> i%2 == 0}
   println("Even List :$evenList  Odd List: $oddList ")
   
   val fruits = listOf("Apple","Orange","Mango","Banana","Peach","Berry","Pineapple")
   val groups = fruits.groupBy(){i -> i.length}
   println(groups)
   
   val list2 = listOf("a", "b", "c", "d")
   val m : Map<String,Int> = list2.associate(){it to it.length }
   println(m)
   
   val zipper = list.zip(list2)
   println(zipper)
      
   
}
