package day11.practice;

public class DAOException extends Exception {
    private static final long serialVersionUID = 1L;
    public DAOException(String msg) {
        super(msg);
    }
    public DAOException(Throwable ex) {
        super(ex);
    }
    public DAOException(String msg, Throwable m) {
        super(msg, m);
    }
}