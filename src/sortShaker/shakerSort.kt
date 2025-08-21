package sortShaker

fun <T: Comparable<T>> Array<T>.sortShaker(): Unit
{
    val swap = fun (array: Array<T>, i: Int, j: Int)
    {
        if (i in array.indices && j in array.indices)
        {
            var value = array.get(i)
            array.set(i, array.get(j))
            array.set(j, value)
        }
    }

    if (this.size < 2) return

    var start = 0
    var end = this.lastIndex

    while (start < end)
    {
        for (i in start until end)
            if (this.get(i) > this.get(i + 1))
                swap(this, i, i + 1)
        end--;

        for (j in end downTo start + 1)
            if (this[j] < this[j - 1])
                swap(this, j, j - 1)
        start++;
    }
}