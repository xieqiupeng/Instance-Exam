package Stream;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CharTest {
    public static void main(String[] args) {
        Character[] charArray =
                args[0].chars()
                        .mapToObj(c -> (char)c)
                        .toArray(Character[]::new);
        Set set = Arrays.stream(charArray)
                .collect(Collectors.toSet());
        set.forEach(System.out::print);
    }
}
