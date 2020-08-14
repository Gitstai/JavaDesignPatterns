package practice.fromWindows;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zst","szy","james","zhansitai","songzhiyan","zstszy","szyzst");
        List<String> result = list.stream()
                .filter(s -> s.startsWith("s"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        List<String> list1 = Arrays.asList("12","12","1111","11111111");
        List<Long> res = list1.stream()
                .map(Long::parseLong)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
