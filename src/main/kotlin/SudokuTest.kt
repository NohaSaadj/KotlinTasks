

fun main(){
    val validBoardFull= arrayOf(
        charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
        charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
        charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
        charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
        charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
        charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
        charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
        charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
        charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
    )
    test("Valid Sudoku (Complete Board)", isValidSudoku(validBoardFull), true)

    val validBoardWithEmptyCell = arrayOf(
        charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    test("Valid Sudoku (With Empty Cells)", isValidSudoku(validBoardWithEmptyCell), true)


    val invalidBoardRow = arrayOf(
        charArrayOf('5', '3', '3', '-', '7', '-', '-', '-', '-'), // '3' repeated
        charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    test("Invalid Sudoku (Duplicate in Row)", isValidSudoku(invalidBoardRow), false)

    val invalidBoardColumn = arrayOf(
        charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        charArrayOf('5', '6', '-', '-', '-', '-', '2', '8', '-'), // '5' repeated in column
        charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )

    test("Invalid Sudoku (Duplicate in Column)", isValidSudoku(invalidBoardColumn), false)

    val invalidBoardGrid = arrayOf(
        charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        charArrayOf('4', '-', '8', '8', '-', '3', '-', '-', '1'), // '8' appears twice in 3x3 box
        charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    test("Invalid Sudoku (Duplicate in Grid)", isValidSudoku(invalidBoardGrid), false)

    val invalidBoardEmpty = arrayOf(
        charArrayOf(' ', ' ', ' ', ' ',' ', ' ', ' ', ' ',' '),
        charArrayOf(' ', ' ', ' ', ' ',' ', ' ', ' ', ' ',' '),
        charArrayOf(' ', ' ', ' ', ' ',' ', ' ', ' ', ' ',' '),
        charArrayOf(' ', ' ', ' ', ' ',' ', ' ', ' ', ' ',' '),
        charArrayOf(' ', ' ', ' ', ' ',' ', ' ', ' ', ' ',' '),
        charArrayOf(' ', ' ', ' ', ' ',' ', ' ', ' ', ' ',' '),
        charArrayOf(' ', ' ', ' ', ' ',' ', ' ', ' ', ' ',' '),
        charArrayOf(' ', ' ', ' ', ' ',' ', ' ', ' ', ' ',' '),
        charArrayOf(' ', ' ', ' ', ' ',' ', ' ', ' ', ' ',' ')

    )
    test("Invalid Sudoku (Empty Board)", isValidSudoku(invalidBoardEmpty), false)


    val invalidBoardCharacters = arrayOf(
        charArrayOf('5', '3', 'X', '-', '7', '-', '-', '-', '-'), // 'X' is invalid
        charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    test("Invalid Sudoku (Invalid Characters)", isValidSudoku(invalidBoardCharacters), false)

    val invalidBoardLength= arrayOf(
        charArrayOf('5', '3', '4', '6', '7', '8', '9', '1'),
        charArrayOf('6', '7', '2', '1', '9', '5', '3', '4'),
        charArrayOf('1', '9', '8', '3', '4', '2', '5', '6'),
        charArrayOf('8', '5', '9', '7', '6', '1', '4', '2'),
        charArrayOf('4', '2', '6', '8', '5', '3', '7', '9'),
        charArrayOf('7', '1', '3', '9', '2', '4', '8', '5'),
        charArrayOf('9', '6', '1', '5', '3', '7', '2', '8'),
        charArrayOf('2', '8', '7', '4', '1', '9', '6', '3'),
        charArrayOf('2', '8', '7', '4', '1', '9', '6', '3')


    )
    test("Invalid Sudoku (Invalid Board Length)", isValidSudoku(invalidBoardLength), false)
}


fun test(name: String, Result:Boolean, CorrectResult:Boolean) {
    if (Result == CorrectResult) {
        println("Correct - $name")
    } else {
        println("Failed - $name")
    }

}