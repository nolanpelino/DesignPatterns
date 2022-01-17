import java.util.ArrayList;
public class InsertionSort implements SortBehavior {

    //sourced from https://stackoverflow.com/questions/35097227/insertion-sort-java-algorithm-in-an-arraylist-string
    //User: DominicEU
    public ArrayList<String> sort(ArrayList<String> data) {  
        int i, j;
        for (i = 1; i < data.size(); i++) {
            String tmp = data.get(i);
            j = i;
            while ((j > 0) && (data.get(j - 1).compareTo(tmp) > 0)) {
                data.set(j, data.get(j - 1));
                j--;
            }
            data.set(j, tmp);
        }
        return data;
    }   
}
