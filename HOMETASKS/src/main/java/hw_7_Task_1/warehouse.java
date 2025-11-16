package hw_7_Task_1;

import java.util.ArrayList;
import java.util.List;

public class warehouse<T> {
    private final List<T> items;

    public warehouse() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public List<T> retrieveAll() {
        List<T> copy = new ArrayList<>(items);
        items.clear();
        return copy;
    }

    public List<T> viewItems() {
        return new ArrayList<>(items);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }
}
