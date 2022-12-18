package task_my_list;

public class Main {
    public static void main(String[] args) {
        MyList<String> userList = new MyList<>();
        userList.add("Джим Керрі");
        userList.add("Сандра Баллок");
        userList.add("Том Хенкс");

        System.out.println("Повернення елементу за індексом: " + userList.getItem(2));
        System.out.println("Пірахунок всіх елементів: ");
        userList.getItemCount();
    }
}
