package sortQuick

/**
 * Быстрой сортировка массива чисел
 */
public fun quickSort(arrayNumbers: IntArray): IntArray
{
    val length: Int = arrayNumbers.size;

    if(length > 1)
        quickSortCalculate(arrayNumbers, 0, length - 1);

    return arrayNumbers;
}


/**
 * Сортировка элементов массива относительно опорного
 */
private fun partition(array: IntArray, left: Int, right: Int): Int
{
    val supportIndex: Int = left + (right - left) / 2
    val x: Int = array[supportIndex];
    var index: Int = left;
    var value: Int;

    value = array[right];
    array[right] = array[supportIndex];
    array[supportIndex] = value;

    for (i in left..< right)
    {
        if(array[i] <= x)
        {
            value = array[i];
            array[i] = array[index];
            array[index] = value;

            index++;
        }
    }

    value = array[index];
    array[index] = array[right];
    array[right] = value;

    return index;
}


/**
 * Выполнение алгоритма быстрой сортировки
 */
private fun quickSortCalculate(array: IntArray, left: Int, right: Int)
{
    if(left < right)
    {
        var supIndex = partition(array, left, right);
        quickSortCalculate(array, left, supIndex - 1);
        quickSortCalculate(array, supIndex + 1, right);
    }
}