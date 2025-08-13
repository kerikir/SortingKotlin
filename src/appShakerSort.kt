import shakerSort.sortShaker

fun main()
{
    val people: Array<Person>  = arrayOf(
        Person("Noah", "Smith"),
        Person("Liam", "Johnson"),
        Person("Mason", "Williams"),
        Person("Jacob", "Jones"),
        Person("William", "Brown"),
        Person("Ethan", "Davis"),
        Person("James", "Miller"),
        Person("Alexander", "Wilson")
    )

    println("Исходный массив:")
    for (human in people)
        println(human.firstName + " " + human.lastName)
    println("\n\n")

    people.sortShaker()

    println("Отсортированный массив:")
    people.forEach { it -> println(it.firstName + " " + it.lastName) }
    println("\n\n")
}


data class Person(val firstName: String, val lastName: String): Comparable<Person>
{
    override fun compareTo(other: Person): Int
    {
        return this.firstName.compareTo(other.firstName)
    }
}