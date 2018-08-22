package exercise;

class Tank {
    String state = "empty";

    Tank(String state) {
        this.state = state;
    }

    void setEmpty() {
        state = "empty";
    }

    @Override
    protected void finalize() throws Throwable {
        if ("full".equals(state))
            System.out.println("Error: state is full");
        super.finalize();
    }
}

public class e12 {
    public static void main(String[] args) {
        Tank t1 = new Tank("full");
        t1.setEmpty();
        new Tank("full");
        System.gc();
    }
}
