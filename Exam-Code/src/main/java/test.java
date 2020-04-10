import java.nio.ByteBuffer;

public class test {
    public static void main(String[] args) {
        int result = 0;
        byte[] binaryData = new byte[]{-1,-1};

        System.out.println("result is" + result);
        result = 65535;
        int originalData = 65535;
        byte[] bytes2 = ByteBuffer.allocate(4)
                .putInt(originalData)
                .array();
        for (byte t : bytes2) {
            System.out.println(t);
        }
    }

}
