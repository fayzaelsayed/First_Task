package sudoku

import kotlin.math.sqrt

fun main() {
    println(
        isSudokuPuzzleValid(
            listOf(
                listOf("-5", "3", "-", "6", "7", "-", "9", "-", "-"),
                listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
                listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
                listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
                listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
            )
        )
    )
}

fun isSudokuPuzzleValid(appliedPuzzle: List<List<String>>): Boolean {
    val size = appliedPuzzle.size
    val subgridSize = sqrt(size.toDouble()).toInt()
    if (subgridSize * subgridSize != size) return false
    for (row in appliedPuzzle) {
        if (!isValidGroup(row.toMutableList(), size)) return false
    }

    for (col in 0 until size) {
        val column = MutableList(size) { appliedPuzzle[it][col] }
        if (!isValidGroup(column, size)) return false
    }

    for (row in 0 until size step subgridSize) {
        for (col in 0 until size step subgridSize) {
            val box = MutableList(subgridSize * subgridSize) { "-" }
            var index = 0
            for (r in 0 until subgridSize) {
                for (c in 0 until subgridSize) {
                    box[index++] = appliedPuzzle[row + r][col + c]
                }
            }
            if (!isValidGroup(box, size)) return false
        }
    }
    return true
}

fun isValidGroup(group: MutableList<String>, size: Int): Boolean {
    group.removeIf { it == "-" }
    if (size < 10) {
        group.forEach {
            val number = it.toIntOrNull() ?: return false
            if (number <= 0) return false
        }
    }
    return group.size == group.distinct().size
}