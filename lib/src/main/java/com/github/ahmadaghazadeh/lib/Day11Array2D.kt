package com.github.ahmadaghazadeh.lib

fun main() {

//    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })
//
//    for (i in 0 until 6) {
//        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//    }

    val arrayHourGlass = arrayOf(
        arrayOf(1, 1, 1, 0, 0, 0),
        arrayOf(0, 1, 0 ,0 ,0, 0),
        arrayOf(1, 1, 1, 0, 0, 0),
        arrayOf(0, 9 ,2 ,-4 ,-4 ,0),
        arrayOf(0, 0, 0, -2 ,0, 0),
        arrayOf(0, 0, -1, -2, -4, 0),
    )
    val maxSumHourGlass=getMaxSumHourGlass(arrayHourGlass)
    print(maxSumHourGlass)
}

fun getMaxSumHourGlass(arrayHourGlass: Array<Array<Int>>): Int {

    var maxSumHourGlass=0
    for (rowIndex in 0..arrayHourGlass.size-3){
        for (colIndex in 0..arrayHourGlass[rowIndex].size-3)
        {
            val sumHourGlass=getSumHourGlass(arrayHourGlass,rowIndex,colIndex)
            if (maxSumHourGlass<sumHourGlass)
            {
                maxSumHourGlass=sumHourGlass
            }
        }
    }
    return maxSumHourGlass
}

fun getSumHourGlass(arrayHourGlass: Array<Array<Int>>, row: Int, col: Int): Int {

    var sumHourGlass=0
    for (rowIndex in row..row+2){
        for (colIndex in col..col+2)
        {
            if(rowIndex==row || rowIndex==row+2){
                sumHourGlass+=arrayHourGlass[rowIndex][colIndex]
            }else if(rowIndex==row+1 && colIndex==col+1){
                sumHourGlass+=arrayHourGlass[rowIndex][colIndex]
            }
        }
    }
    return sumHourGlass
}
