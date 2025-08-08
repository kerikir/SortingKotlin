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
    val supportIndex: Int = (right - left) / 2
    val x: Int = array[supportIndex];
    var index: Int = left;
    var value: Int;

    for (i in 1.. right)
    {
        if(array[i] <= x && i != supportIndex)
        {
            value = array[i];
            array[i] = array[index];
            array[index] = value;

            index++;
        }
    }

    value = array[index];
    array[index] = array[supportIndex];
    array[supportIndex] = value;

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