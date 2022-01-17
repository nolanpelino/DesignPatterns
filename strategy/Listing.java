import java.util.*;
public class Listing {
    private String title;
    private ArrayList<String> items = new ArrayList<String>();
    private SortBehavior sortBehavior = new BubbleSort();

    public Listing(String title) {
        this.title = title;
    }

    public void add(String item) {
       this. items.add(item);
    }

    public void remove(String item) {
        this.items.remove(item);
    }

    public String getTitle() {
        return this.title;
    }

    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    public ArrayList<String> getSortedList() {
        this.sortBehavior.sort(this.items);
        return this.items;
    }

    public ArrayList<String> getUnSortedList() {
        return this.items;
    }


}
