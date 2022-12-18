package task_my_list;
import java.util.ArrayList;

public class MyList<T> implements ICopyOfList<T> {

private ArrayList<T> myArrayList;
    int number;

    public MyList() {
        myArrayList = new ArrayList<>();
    }

    public void add(T set) {
        myArrayList.add(set);

    }

    public T getItem(int index) {
        this.number = index;
        return myArrayList.get(index);
    }

    public void getItemCount() {
        System.out.println(myArrayList.size());
    }

    @Override
    public String toString() {
        return "myArrayList=" + myArrayList +
                '}';
    }
}
