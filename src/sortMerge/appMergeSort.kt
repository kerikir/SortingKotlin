package sortMerge

import kotlin.random.Random

fun main()
{
    val numbers: ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in 1.rangeTo(10))
    {
        numbers.add(Random.nextInt(11, 100))
    }
    numbers.shuffle()

    fun <T> printArrayInConsole(msgInfo: String, array: MutableList<T>) : Unit
    {
        println(msgInfo + ":")
        array.forEach { print("$it \t") }
        println("\n\n")
    }

    printArrayInConsole("Исходный массив", numbers)

    val mergeSort: MergeSort = MergeSort()
    sortingCollection(numbers, mergeSort::sort)

    printArrayInConsole("Отсортированный массив", numbers)
}


fun sortingCollection(mutableList: MutableList<Int>, funcSorting: (MutableList<Int>) -> Unit)
{
    funcSorting(mutableList)
}