package exercise.e8;

import java.util.ArrayList;
import java.util.List;

class Connection {
    private Connection() {}
    public static Connection getConnection()  { return new Connection();}
}

public class ConnectionManager {
    private static List<Connection> connections = new ArrayList<Connection>();

    static {
        for (int i = 0; i < 10; i++) {
            connections.add(Connection.getConnection());
        }
    }

    public static void getConnection() {
        Connection con = connections.remove(0);
        System.out.println(con);
    }

    public static void main(String[] args) {
        getConnection();
    }
}
