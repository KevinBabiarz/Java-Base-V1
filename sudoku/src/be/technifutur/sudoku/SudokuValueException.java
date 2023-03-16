package be.technifutur.sudoku;

public class SudokuValueException extends SudokuException{
    public SudokuValueException() {
    }

    public SudokuValueException(String message) {
        super(message);
    }

    public SudokuValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public SudokuValueException(Throwable cause) {
        super(cause);
    }
}