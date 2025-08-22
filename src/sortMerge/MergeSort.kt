package sortMerge

class MergeSort : ISorting
{
    override fun sort(array: MutableList<Int>)
    {
        if (array.size > 1)
        {
            val buffer: MutableList<Int> = array.toMutableList()
            mergeSortCalculate(array, buffer, 0, array.lastIndex)
        }
    }


    private fun mergeSortCalculate(array: MutableList<Int>, buffer: MutableList<Int>, start: Int, end: Int)
    {
        //выход если 1 элемент
        if (start < end)
        {
            // разделение массива
            val middle: Int = start + (end - start) / 2
            mergeSortCalculate(array, buffer, start, middle)
            mergeSortCalculate(array, buffer, middle + 1, end)

            // получение начальных индексов соседних массивов
            var indexFirst = start
            var indexSecond = middle + 1
            // индекс для сортировки
            var k = start

            // проход по несортированной части массива
            while (indexFirst <= middle || indexSecond <= end)
            {
                // левое значение меньше
                if (indexSecond > end || (indexFirst <= middle && array[indexFirst] < array[indexSecond]))
                {
                    buffer[k] = array[indexFirst]
                    indexFirst++
                }
                // правое значение меньше
                else
                {
                    buffer[k] = array[indexSecond]
                    indexSecond++
                }

                // смещения индекса сортированной части
                k++
            }

            // запись отсортированной части
            for (i in start..end)
            {
                array[i] = buffer[i]
            }
        }
    }
}