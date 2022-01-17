import java.util.*;

public class BubbleSort implements SortBehavior {

    // code sourced from https://www.youtube.com/watch?v=467BD-yuvmk&t=672s&ab_channel=MohamedY.ElAmrani
    public ArrayList<String> sort(ArrayList<String> data) {  
            for (int j = 0; j < data.size() -1 ; j++) {
                for (int i = 1; i < data.size() -1; i++) {
                    if (data.get(i).compareTo(data.get(i+1)) > 0) {
                        String temp = data.get(i);
                        data.set(i, data.get(i+1));
                        data.set(i + 1, temp);
                    }
                }
            }
            return data;
    }   
}
