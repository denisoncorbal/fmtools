package br.com.dgc.fmtools.domain.exceptions;

public class NotUniqueFieldPositionsException extends Exception {
    private static final String notUniqueFieldPositionsMessage = "Formation must have a list of unique field positions";

    public NotUniqueFieldPositionsException() {
        super(NotUniqueFieldPositionsException.notUniqueFieldPositionsMessage);
    }
}
