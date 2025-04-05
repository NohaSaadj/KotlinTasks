fun main(args: Array<String>) {
}

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val sudokuSize = board.size

    if (sudokuSize != 9 || board.any { it.size != 9 }) {
        return false
    }

    val subgridSize = Math.sqrt(sudokuSize.toDouble()).toInt()

    if (subgridSize * subgridSize != sudokuSize) {

        return false // Ensure valid Sudoku size
    }

    if (!checkValidCharacters(board)) {
        return false //Check if the board contains only valid characters
    }

    // Track the numbers seen in each row, column, and subgrid
    val rows = Array(sudokuSize) { mutableSetOf<Char>() }
    val cols = Array(sudokuSize) { mutableSetOf<Char>() }
    val boxes = Array(sudokuSize) { mutableSetOf<Char>() }


    for (r in 0 until sudokuSize) {
        for (c in 0 until sudokuSize) {
            val num = board[r][c]
            if (num == '-') continue // Skip empty cells

            //Calculate subgrid index
            val boxIndex = (r / subgridSize) * subgridSize + (c / subgridSize) // 3×3 box index

            if (num in rows[r] || num in cols[c] || num in boxes[boxIndex]) {
                return false // Duplicate found
            }

            rows[r].add(num)
            cols[c].add(num)
            boxes[boxIndex].add(num)
        }
    }

    return true
}

// Function to check if the board contains only valid characters ('1'-'9' or '-')
fun checkValidCharacters(board: Array<CharArray>): Boolean {
    return board.all { row -> row.all { it in '1'..'9' || it == '-' } }
}


/* Function to ensure all rows have the correct length
fun checkLen(board: Array<CharArray>): Boolean {
    return board.any { it.size != board.size }
}*/


