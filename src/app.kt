import kotlin.random.Random

fun main()
{
    // Быстрая сортировка
    println("Быстрая сортировка:");

    // Печать исходного массива
    drawLine('=', 35);
    println("Исходный массив:")
    var arrayNumbersQuickSort: IntArray = fillArrayRandomNumbers(20, 1, 100);
    for(i in 0..< arrayNumbersQuickSort.size)
    {
        print(arrayNumbersQuickSort[i].toString() + "\t");
    }
    println();

    // Выполнение быстрой сортировки
    arrayNumbersQuickSort = quickSort(arrayNumbersQuickSort);

    // Печать отсортированного массива
    println("Отсортированный массив:")
    for(i in 0..< arrayNumbersQuickSort.size)
    {
        print(i.toString() + "\t");
    }
    println();
    drawLine('=', 35);


//    println("Укажите размер массива:");
//    val sizeArrayQuickSort: Int? = readLine()?.toInt();
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