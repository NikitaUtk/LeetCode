import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidParentheses {
    public static void main(String[] args) {
        String output = "()[]{}".chars().mapToObj( ch -> new Character( (char)ch ) )
                // сгруппировать по символам, внутри группы подсчитать количество
                .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ) )
                // группировка возвращает Map<Character, Integer> с количеством разных символов
                .entrySet().stream()
                // если надо выбрать только встречающиеся 1 раз
                .filter( entry -> entry.getKey() == ')' || entry.getKey() == '(')
                // раз forEach плохо :)
                //.forEach( entry -> System.out.printf( "'%s' -> %d%n", entry.getKey(), entry.getValue() ) );
                .map( entry -> String.format( "'%s' -> %d%n", entry.getKey(), entry.getValue() ) )
                .collect( Collectors.joining() );
         if(output)

        System.out.println( output );
         String s = "()[]{}";
         isValid(s);
    }
    public static boolean isValid(String s) {

        for(int i = 0; i < s.length(); i++){

            for(int j = 0; j < s.length(); j++){

            }
        }
        return false;
    }
}
