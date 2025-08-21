package sortInsertion

class InsertionSort
{
    companion object
    {
        public fun sort(numbers: MutableList<Int>)
        {
            val size: Int = numbers.count()

            if (size > 1)
            {
                var j: Int
                var value: Int

                for (i in 1..< size)
                {
                    value = numbers[i]
                    j = i

                    while (j > 0 && numbers[j - 1] > value)
                    {
                        numbers[j] = numbers[j - 1]
                        --j
                    }

                    numbers[j] = value
                }
            }
        }
    }
}