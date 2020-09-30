package util;

public class InputTest {
    public static void main(String[] args) {
       Input user = new Input();
       user.getString();
       user.yesNo();
       user.getInt(3, 15);
       user.getInt();
       user.getDouble(4.95, 100.50);
       user.getDouble();
    }

}
