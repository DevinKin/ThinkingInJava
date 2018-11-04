package strings;

public class DataBaseException extends Exception{
    public DataBaseException(int transactionID, int queryID, String message) {
        super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
    }

    public static void main(String[] args) {
        try {
            throw new DataBaseException(3,7,"Write failed");
        } catch (DataBaseException e) {
            System.out.println(e);
        }
    }
}
