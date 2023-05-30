import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");

        Scanner scanner = new Scanner(System.in);
        int listSize = scanner.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список");

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        while (list.size() < listSize) {
            list.add(random.nextInt(maxValue));
        }

        System.out.println("Вот случайный список:" + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра:");
        int filterValue = scanner.nextInt();

        Filter filter = new Filter(filterValue);
        List<Integer> resultlist = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println(resultlist);

        logger.log("Завершаем программу");
    }
}