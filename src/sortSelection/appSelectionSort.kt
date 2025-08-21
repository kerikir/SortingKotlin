package sortSelection

fun main() : Unit
{
    val numbersFirst: IntArray = IntArray(12) { i ->

        when (i % 10)
        {
            0 -> i + 1
            1 -> i + 5
            2 -> i - 1
            in 3..7 -> i * 5 - 2
            else -> i + 3
        }
    }

    val numbersSecond: IntArray = IntArray(8)
    {
        i -> (i + 1) * 10 - i * 2
    }

    val numbers = numbersFirst + numbersSecond
    numbers.shuffle()
    printArray(array = numbers, msg = "Исходный массив")

    val selectionSort = object {

        private var min: Int = 0
        private var index: Int = 0

        operator fun invoke(array: IntArray) : Unit
        {
            for(i in array.indices)
            {
                index = i
                min = array[index]

                // Поиск минимального элемента в неотсортированной части массива
                for (j in (i + 1).rangeTo(array.lastIndex))
                {
                    if (array[j] < min)
                    {
                        index = j
                        min = array[index]
                    }
                }

                array[index] = array[i]
                array[i] = min
            }
        }
    }

    selectionSort(numbers)
    printArray("Отсортированный массив", numbers)
}


fun printArray(msg: String, array: IntArray) : Unit
{
    println("$msg:")
    array.forEach { print("$it\t") }
    println("\n\n")
}