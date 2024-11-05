import java.util.*;

/*
Дан лист строк, нужно получить Map<String, Boolean>,
где ключ - строка, значение - true, если строка встретилась более одного раза, иначе false
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of(
                "banana", "orange", "apple", "orange", "banana", "grape", "kiwi"
        );
        Map<String, Boolean> result = getStringBooleanMap(list);
        //вивід результату циклом for
        for (Map.Entry<String, Boolean> entry : result.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    // Метод для створення Map<String, Boolean>
     public static Map<String, Boolean> getStringBooleanMap(List<String> list) {
        // Створюємо Map для підрахунку частоти кожного рядка
          Map<String, Boolean> resultMap = new HashMap<>();

         // Створюємо Set для перевірки унікальності елементів
         Set<String> uniqueElements = new HashSet<>();

         for (String s : list){
             resultMap.put(s, !uniqueElements.add(s));
         }
         return resultMap;
     }
}