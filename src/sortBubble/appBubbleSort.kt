package sortBubble

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.random.Random

fun main()
{
    val ch: Char = '=';
    val numberRepeat: Int = 120;

    // Быстрая сортировка
    println("Сортировка пузырьком:")

    drawLine(ch, numberRepeat)
    val arrayDoubleBubbleSort = Array<Double>(15)
    {
        BigDecimal(Random.nextDouble(5.0)).setScale(
            2,
            RoundingMode.HALF_EVEN
        ).toDouble()
    }
    printArrayInfo("Исходный массив", arrayDoubleBubbleSort)

    bubbleSort(arrayDoubleBubbleSort)

    printArrayInfo("Отсортированный массив", arrayDoubleBubbleSort)
    drawLine(ch, numberRepeat)
    println("\n\n\n")
}


/**
 * Заполнение массива IntArray случайными числами
 */
fun fillArrayRandomNumbers(size: Int, min: Int, max: Int): IntArray
{
    val random: Random = Random;
    val array: IntArray = IntArray(size);

    for (i in 0..array.size - 1)
    {
        array[i] = random.nextInt(min, max);
    }

    return array;
}


/**
 * Отрисовка отделителя
 */
fun drawLine(ch: Char, repeat: Int)
{
    for (i in 1..repeat)
        print(ch);

    println();
}


/**
 * Печать информации о массиве
 */
fun printArrayInfo(info: String, array: IntArray)
{
    println("$info :")
    for(i in 0..< array.size)
    {
        print(array[i].toString() + "\t");
    }
    println();
}


/**
 * Печать информации о массиве
 */
fun <T: Number> printArrayInfo(info: String, array: Array<T>)
{
    println("$info :")
    array.forEach({ value -> print(value.toString() + "\t") })
    println();
}