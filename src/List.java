import java.util.ArrayList;

class List
{
    static ArrayList<String> toDoList = new ArrayList<>(){{
        add("Первое дело");
    }};


    static void Show()
    {
        for (int i = 0; i < toDoList.size(); i++)
            System.out.println(i + " - " + toDoList.get(i));
    }
}
