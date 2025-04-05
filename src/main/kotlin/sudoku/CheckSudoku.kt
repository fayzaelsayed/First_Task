package sudoku

fun main() {
    check(
        name = "when enter a sudoku puzzle with negative number in a row or a column return false",
        result = isSudokuPuzzleValid(
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
        ),
        correctResult = false
    )

    check(
        name = "when enter a sudoku puzzle with several negative numbers in a row or a column return false",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("-5", "3", "-", "6", "7", "-", "9", "-", "-"),
                listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
                listOf("-", "9", "-8", "-", "-", "-", "-", "6", "-"),
                listOf("8", "-", "-", "-", "-6", "-", "-", "-", "3"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
                listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a sudoku puzzle with zero in a row or a column return false",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("0", "3", "-", "6", "7", "-", "9", "-", "-"),
                listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
                listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
                listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
                listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a sudoku puzzle with several zeros in a row or a column return false",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("0", "3", "-", "0", "7", "-", "9", "-", "-"),
                listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
                listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
                listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
                listOf("4", "-", "-", "0", "-", "3", "-", "-", "1"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
                listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a sudoku puzzle with empty number in a row or a column return false",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("", "3", "-", "6", "7", "-", "9", "-", "-"),
                listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
                listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
                listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
                listOf("4", "-", "-", "8", "-", "", "-", "-", "1"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
                listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a sudoku puzzle with empty numbers in a row or a column return false",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("", "3", "-", "6", "", "-", "9", "-", "-"),
                listOf("6", "-", "-", "1", "", "5", "-", "-", "-"),
                listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
                listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
                listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a sudoku puzzle with blank number in a row or a column return false",
        result = isSudokuPuzzleValid(
            listOf(
                listOf(" ", "3", "-", "6", "7", "-", "9", "-", "-"),
                listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
                listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
                listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
                listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a sudoku puzzle with blank numbers in a row or a column return false",
        result = isSudokuPuzzleValid(
            listOf(
                listOf(" ", "3", "-", "6", "7", "-", " ", "-", "-"),
                listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
                listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
                listOf("8", "-", "-", "-", " ", "-", "-", "-", "3"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
                listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a sudoku puzzle with repeated number in a row return false",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("5", "3", "-", "5", "7", "-", "9", "-", "-"),
                listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
                listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
                listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
                listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a sudoku puzzle with repeated number in a column return false",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("5", "3", "8", "-", "7", "-", "-", "-", "-"),
                listOf("5", "-", "-", "1", "9", "5", "-", "-", "-"),
                listOf("-", "9", "5", "-", "-", "-", "-", "6", "-"),
                listOf("5", "-", "-", "-", "6", "-", "-", "-", "3"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
                listOf("-", "7", "-", "-", "-", "-", "2", "8", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a sudoku puzzle with special character other - return false",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("@", "3", "-", "6", "7", "-", "9", "-", "-"),
                listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
                listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
                listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
                listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a sudoku puzzle with invalid grid return false",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("_", "3", "8", "-", "7", "-", "-", "-", "-", "-"),
                listOf("6", "-", "-", "1", "9", "5", "-", "-", "-", "-"),
                listOf("-", "9", "5", "-", "-", "-", "-", "6", "-", "-"),
                listOf("8", "-", "-", "-", "6", "-", "-", "-", "3", "-"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1", "-"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6", "-"),
                listOf("-", "7", "-", "-", "-", "-", "2", "8", "-", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5", "-"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9", "-"),
            )
        ),
        correctResult = false
    )

    check(
        name = "when enter a sudoku puzzle with invalid subgrid return false",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("_", "3", "8", "-", "7", "-", "-", "-", "-", "-"),
                listOf("6", "-", "-", "1", "9", "5", "-", "-", "-", "-"),
                listOf("-", "9", "5", "-", "-", "-", "-", "6", "-", "-"),
                listOf("8", "-", "-", "-", "6", "-", "-", "-", "3", "-"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1", "-"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6", "-"),
                listOf("-", "7", "-", "-", "-", "-", "2", "8", "-", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5", "-"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9", "-"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9", "-")
            )
        ),
        correctResult = false
    )


    check(
        name = "when enter a valid 16*16 sudoku puzzle return true",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("5", "3", "-", "7", "f", "-", "9", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                listOf("6", "-", "-", "1", "a", "5", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                listOf("-", "9", "2", "-", "-", "-", "-", "b", "-", "-", "-", "-", "-", "-", "-", "-"),
                listOf("8", "-", "-", "-", "6", "-", "-", "-", "3", "-", "-", "-", "-", "-", "-", "-"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1", "-", "-", "-", "-", "-", "-", "-"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6", "-", "-", "-", "-", "-", "-", "-"),
                listOf("-", "6", "-", "-", "-", "-", "d", "8", "-", "-", "-", "-", "-", "-", "-", "-"),
                listOf("-", "-", "-", "c", "1", "9", "-", "-", "5", "-", "-", "-", "-", "-", "-", "-"),
                listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"),
                listOf("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-")
            )

        ),
        correctResult = true
    )

    check(
        name = "when enter a sudoku puzzle with valid numbers in a row and a column return true",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("5", "3", "-", "6", "7", "-", "9", "-", "-"),
                listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
                listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
                listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
                listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
                listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
                listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
                listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
                listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
            )
        ),
        correctResult = true
    )

    check(
        name = "when enter a sudoku puzzle with valid and complete numbers with perfect gird and subgrid size in a row and a column return true",
        result = isSudokuPuzzleValid(
            listOf(
                listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = true
    )
}

private fun check(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success $name")
    } else {
        println("Fail $name")
    }
}