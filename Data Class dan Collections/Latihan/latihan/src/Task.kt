fun main() {

    // TODO 1
    val user = mapOf<String, String>(
            "user" to "User",
            "name" to "Name: John",
            "age" to "Age: 23",
            "address" to "Address: St. Petersburg"
    )

    // TODO 2
    val name = user.getValue("name")
    val age = user.getValue("age")
    val address = user.getValue("address")

    // TODO 3
    println(user.getValue("user"))
    println(name)
    println(age)
    println(address)

}