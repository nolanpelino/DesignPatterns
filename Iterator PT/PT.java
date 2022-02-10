import java.util.ArrayList;

/**
 * @author npelino
 * PT is an object containing the physcial therapy session as a whole
 */
public class PT {
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises = new Exercise[2];
    private int numExercises = 0;

    public PT(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }

    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
        if(numExercises == exercises.length) {
            this.exercises = growArray(exercises);
        }

        Exercise newEx = new Exercise(title, muscleGroups, directions);
        exercises[numExercises] = newEx;
        numExercises++;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getBio() {
        return this.bio;
    }

    private Exercise[] growArray(Exercise[] exercises) {
        int exLength = exercises.length * 2;
        Exercise[] updatedExercises = new Exercise[exLength];

        for (int i = 0; i < exercises.length; i++)
            updatedExercises[i] = exercises[i];
        return updatedExercises;
    }

    public ExerciseIterator createIterator() {
        ExerciseIterator exIterator = new ExerciseIterator(exercises);
        return exIterator;
    }

    public String toString() {
        String total = new String();
        total = total + firstName + " " + lastName + "\n" + bio + "\n";
        return total;
    }
}
