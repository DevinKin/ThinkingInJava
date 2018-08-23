package access;

import access.dessert.*;

public class Dinner {
    public static void main(String[] args) {
        Cookie x = new Cookie();
//        x.bite();    // Can't access
        // 包访问权限，包外的类无法访问该方法
    }
}
