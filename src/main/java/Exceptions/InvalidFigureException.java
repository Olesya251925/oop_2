package Exceptions;

//фигура некорректна или недопустима в контексте операции.
public class InvalidFigureException extends Exception {
    public InvalidFigureException(String message) {
        super(message);
    }
}
