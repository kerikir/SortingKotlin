import sortComb.CombSort

class Person(val firstName: String): Comparable<Person>
{
    var age: Int = 20
        set(value)
        {
            if (value > 0 && value <= 105)
                field = value
        }
        get() = field


    constructor(firstName: String, age: Int) : this(firstName)
    {
        this.age = age
    }


    override fun compareTo(other: Person): Int = this.age - other.age;

    override fun toString(): String = "${this.firstName} - ${this.age}"
}


fun main()
{
    val people: Array<Person> = arrayOf(
        Person("Kirill", 19),
        Person("Alexander", 40),
        Person("Marina", 14),
        Person("Vladimir", 16),
        Person("Pavel", 29),
        Person("Maxim", 35),
        Person("Igor", 65),
        Person("Boris", 39),
        Person("Denis")
    )

    println("Исходный массив:")
    people.forEachIndexed({i, _ -> println(people[i])})
    println("\n\n\n")

    val combSort = CombSort(people)
    combSort.sort()

    println("Отсортированный массив по возрасту:")
    people.forEach { person: Person -> println(person) }
    println("\n\n\n")

    val personComparator = Comparator { p1: Person, p2: Person -> p1.firstName.compareTo(p2.firstName) }
    combSort.sort(personComparator)

    println("Отсортированный массив по именам:")
    people.forEach { println(it) }
    println("\n\n\n")
}