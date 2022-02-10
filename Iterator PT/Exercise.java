import java.util.ArrayList;
/**
 * @author npelino
 * Exercise class is an object containing exercise details
 */
public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles = new ArrayList<String>();
    private ArrayList<String> directions = new ArrayList<String>();

    /**
     * Exercise constructor
     * @param String
     */
    public Exercise(String title) {
        this.title = title;
    }

    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }

    public void addTargetMuscle(String muscle) {
        this.targetMuscles.add(muscle);
    }

    public void removeTargetMuscle(String muscle) {
        this.targetMuscles.remove(muscle);
    }

    /**
     * Returns a string of the exrecises Title, target muscles, and directions
     */
    public String toString() {
        String totalExercise = new String();
        totalExercise += this.title;
        totalExercise += "\n";

        for(String muscle: targetMuscles) {
            totalExercise += muscle;
            if (muscle != targetMuscles.get(targetMuscles.size() - 1))
                totalExercise += ", ";
            else
                totalExercise += "\n";
        }
        for(String direction : directions){
            totalExercise += "- ";
            totalExercise += direction;
            totalExercise += "\n";
        }

        return totalExercise;
    }
}
