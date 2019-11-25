// methodes utilitaires fournies pour creer des collections

emptyList<Any>()
emptyMap<Any, Any>()

val listOf = listOf(0, 1, 2, 3)
val mapOf = mapOf("one" to 1, "two" to 2, "three" to 3)

intArrayOf(1, 2, 3)
booleanArrayOf(true, false, true)
doubleArrayOf(1.toDouble(), 2.0, 3.3)

listOfNotNull(1, "a", null, "bleh", Unit)

val mutableListOf = mutableListOf(1, 2, 3)
val mutableMapOf = mutableMapOf(1 to "one", 2 to "two")

println(listOf + mutableListOf)
//println(listOf + mutableMapOf) // est-ce que ca va fonctionner?

var mylist = listOf + mutableListOf;
mylist += 4
mylist -= 3
println(mylist)

println(mylist[2])
println(mapOf["one"])

mylist.getOrNull(5)

println((0..9001).average())

