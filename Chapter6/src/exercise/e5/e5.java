package exercise.e5;

public class e5 {
    public static void main(String[] args) {
        E5test e5test = new E5test();
        // private 成员不可被访问，找不到符号
        //! e5test.privateMethod();

        // protected 具有包访问权限，可以被访问
        e5test.proMethod();

        // public 可以被所有类访问到
        e5test.pubMethod();

        // 包访问权限，只能被包内的类所访问到
        e5test.packageMethod();
    }
}
