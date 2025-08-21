package sortBubble

/**
 * Сортировка пузырьком массива
 */
public fun <T: Comparable<T>> bubbleSort(array: Array<T>)
{
    for (i in 0..array.lastIndex - 1)
    {
        for (j in 0..< array.lastIndex - i)
        {
            if (array[j] > array[j + 1])
            {
                swap(array, j, j + 1)
            }
        }
    }
}


/**
 * Перестановка элементов массива
 */
public fun <T> swap(array: Array<T>, firstIndex: Int, secondIndex: Int)
{
    var value: T = array[firstIndex]
    array[firstIndex] = array[secondIndex]
    array[secondIndex] = value
}