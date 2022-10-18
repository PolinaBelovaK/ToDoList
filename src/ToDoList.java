import java.util.Scanner;

public class ToDoList
{
    public static void main(String[] args)
    {
        System.out.println("Планер дня. Команды:\nLIST - выведет все твои дела по порядку;\nADD - добавит новое дело в твой список;\nEDIT - изменить уже существующее дело по его номеру;\nDELETE - удалить запись по номеру;\nEXIT - прекращает работу программы.");
        System.out.println("========================================");
        System.out.println("НАЧАЛО ПРОГРАММЫ");
        System.out.println("========================================");
        listenToMe();
    }

    static String listenToMe ()
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            String input = sc.nextLine();
            if (input.equals("LIST"))
            {
                List.Show();
            }
            if (input.contains("ADD"))
            {
                System.out.println("Введите новую задачу");
                List.toDoList.add(sc.nextLine());
                System.out.println("Задача успешно внесена!");
            }
            if (input.contains("EDIT"))
            {
                System.out.println("Введите номер дела, которое необходимо изменить:");
                int num = sc.nextInt();
                System.out.println("Введите новое дело: ");
                List.toDoList.add(num, sc.nextLine());
                sc.nextLine();
                System.out.println("Задача успешно изменена");
            }
            if (input.equals("DELETE"))
            {
                System.out.println("Введите номер дела, которое необходимо удалить:");
                int num = sc.nextInt();
                List.toDoList.remove(num);
                System.out.println("Задача успешно удалена");
            }
            if (input.equals("EXIT"))
            {
                System.out.println("Завершение программы...");
                System.exit(0);
            }
        }
    }
}
