package exercise;

class Tank {
    float level;
}

public class e2 {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 12.5f;
        t2.level = 13.2f;
        System.out.println("1: t1.level: " + t1.level +
            " , t2.level: " + t2.level);
        t1 = t2;
        System.out.println("1: t1.level: " + t1.level +
                " , t2.level: " + t2.level);
        t1.level = 14.5f;
        System.out.println("1: t1.level: " + t1.level +
                " , t2.level: " + t2.level);

    }

}
