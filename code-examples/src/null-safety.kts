var nonNullableString: String = "i am not nullable"
println(nonNullableString)

// not ok
//nonNullableString = null

var nullableInt: Int? = 5;
nullableInt = 5;

// prend en entree un type NON NULLABLE
fun printMyNonNullableObject(any: Any) = println(any)
//printMyNonNullableObject(nullableInt ?: 6)
//printMyNonNullableObject(if (nullableInt == null) 6 else nullableInt as Int)
//printMyNonNullableObject(nullableInt!!)


// safe calls
//var myLongString: String = "this is not a long string"
var myLongString: String? = null
//println("I think my long string is this long : ${myLongString.length}")
//myLongString?.let{ println("I think my long string is this long : ${it.length}")}


