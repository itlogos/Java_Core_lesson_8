package ua.lviv.lgs.lessonlogos8;

public class WrongInputConsoleParametersException extends Exception {
    private String message;

    public String getMessage() {
        return message;
    }

    public WrongInputConsoleParametersException(String message) {
        super(message);
        this.message = message;
    }
    
    

}
