package HuaWei;

public class Transfer {
    public static void main(String[] args) {
        // 16转10
        String sixteen = args[0];
        int tenInt = Integer.valueOf(sixteen, 16);
        System.out.println(tenInt);
        // 10转16
        String ten = args[1];
        int tenInt2 = Integer.parseInt(ten);
        String sixteen2 = Integer.toHexString(tenInt2);
        System.out.println(sixteen2);
    }
}
