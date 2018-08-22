package exercise;

class e10 {
    public static void main(String[] args) {
        final int endWithOne = 0x55555555;
        final int endWithZero = 0xaaaaaaaa;
        System.out.println("endWithOne: " + Integer.toBinaryString(endWithOne));
        System.out.println("endWithZero: " + Integer.toBinaryString(endWithZero));
        System.out.println("endWithOne & endWithZero: " + Integer.toBinaryString(endWithOne & endWithZero));
        System.out.println("endWithOne | endWithZero: " + Integer.toBinaryString(endWithOne | endWithZero));
        System.out.println("~endWithOne: " + Integer.toBinaryString(~endWithOne));
        System.out.println("~endWithZero: " + Integer.toBinaryString(~endWithZero));
        System.out.println("endWithOne ^ endWithZero: " + Integer.toBinaryString(endWithOne ^ endWithZero));
    }
}