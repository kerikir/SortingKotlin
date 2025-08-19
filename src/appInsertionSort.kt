import sortingInsertion.InsertionSort

fun main()
{
    try
    {
        var i: Int = 1

        print("Введите размер последовательности: ")
        val sizeString = readLine()
        val size = sizeString?.toInt() ?: 20

        val numbers: MutableList<Int> = generateSequence { if (i <= size) i++ else null }.shuffled().toMutableList()

        println("Исходная коллекция:")
        numbers.forEach { print("$it \t") }
        println("\n\n\n")

        InsertionSort.sort(numbers)

        println("Отсортированныя коллекция:")
        numbers.forEach({it -> print("$it \t")})
        println("\n\n\n")
    }
    catch (e: Exception)
    {
        println(e.message)
        for (i in e.stackTrace.indices)
        {
            println(e.stackTrace[i])
        }
    }
}