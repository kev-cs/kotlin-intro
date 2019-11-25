class PersonClass (val name: String, val lastName: String, var age: Int = 0)
data class PersonDataClass (val name: String, val lastName: String, var age: Int = 0)

val normalClassedPerson = PersonClass("Jane", "Doe")
val dataClassedPerson = PersonDataClass("John", "Doe")

// montrer generated gets/sets
//normalClassedPerson.
// montrer equals, hashcode, tostring, mais surtout copy
//dataClassedPerson.

//val (name, lastName, age) = normalClassedPerson
//val (name, lastName, age) = dataClassedPerson
