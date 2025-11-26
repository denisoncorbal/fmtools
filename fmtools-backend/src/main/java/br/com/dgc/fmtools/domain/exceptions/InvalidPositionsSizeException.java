package br.com.dgc.fmtools.domain.exceptions;

public class InvalidPositionsSizeException extends Exception {

    private static final String invalidPositionsSizeMessage = "A formation cannot have more than 11 positions";

    public InvalidPositionsSizeException() {
        super(InvalidPositionsSizeException.invalidPositionsSizeMessage);
    }
}
