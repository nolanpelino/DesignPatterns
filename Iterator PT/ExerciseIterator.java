/**
 * @author npelino
 * Creates an iterator to move throughout an Exercise Array
 */

public class ExerciseIterator implements Iterator {
    private Exercise[] exercises;
	private int position = 0;
	
    /**
     * 
     * @param Exercise array
     */
	public ExerciseIterator(Exercise[] exercises) {
		this.exercises = exercises;
	}
	
	public Exercise next() {
		Exercise exercise = exercises[position];
		position = position + 1;
		return exercise;
	}
	
	public boolean hasNext() {
		if(position >= exercises.length || exercises[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
