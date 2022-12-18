package task_my_list;

public interface ICopyOfList<T> {
    void add(T item);
    T getItem (int index);
    void getItemCount();

}
