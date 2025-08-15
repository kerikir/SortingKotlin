package sortComb

import kotlin.math.round

class  CombSort <T: Comparable<T>> (val array: Array<T>)
{
    val factor: Double = 1.247
    private var step: Double
    private var stepInteger: Int

    init
    {
        step = array.size / factor
        stepInteger = round(step).toInt()
    }

    public fun sort() : Unit
    {
        while(step >= 1.0)
        {
            for (i in stepInteger..array.lastIndex)
            {
                if (array[i - stepInteger] > array[i])
                    array[i] = array[i - stepInteger].also { array[i - stepInteger] = array[i] }
            }

            step /= factor
            stepInteger = round(step).toInt()
        }

        step = array.size / factor
        stepInteger = round(step).toInt()
    }


    public fun sort(comparator: Comparator<T>) : Unit
    {
        while(step >= 1.0)
        {
            for (i in stepInteger..array.lastIndex)
            {
                if (comparator.compare(array[i - stepInteger], array[i]) > 0)
                    (array[i] to array[i - stepInteger]).apply {
                        array[i - stepInteger] = this.first
                        array[i] = this.second
                    }
            }

            step /= factor
            stepInteger = round(step).toInt()
        }

        step = array.size / factor
        stepInteger = round(step).toInt()
    }
}