import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Book_Stream {
    public static void main(String[] args) {
        
        List<String> names = List.of("ノーゲーム・ノーライフ1", "ノーゲーム・ノーライフ2", 
                "ライアー・ライアー1", "ライアー・ライアー2");
        long count = names.stream().filter(name -> name.startsWith("ノ")).count();
        System.out.println(count);
        
        List<String> result2 = names.stream().filter(name -> name.contains("1")).toList();
        System.out.println(result2);

        List<String> result3 = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(result3);

        boolean hasBookName = names.stream().anyMatch(name -> name.equals("ライアー・ライアー2"));
        System.out.println(hasBookName);
        
    }
}