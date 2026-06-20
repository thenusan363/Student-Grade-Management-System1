/**
 * Represents a student with ID, name and marks.
 */
public class Student {

    private int id;
    private String name;
    private int marks;
    /**
     * Creates a student object.
     * 
     * @param id Student ID
     * @param name Student Name
     * @param marks Student Marks
     */
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    /**
     * Returns student ID.
     * 
     * @return student ID
     */
    public int getId() {
        return id;
    }
    /**
     * Returns student name.
     * 
     * @return student name
     */
    public String getName() {
        return name;
    }
    /**
     * Returns student marks.
     * 
     * @return student marks
     */
    public int getMarks() {
        return marks;
    }
    /**
     * Updates student name.
     * 
     * @param name new name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Updates student marks.
     * 
     * @param marks new marks
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }
    /**
     * Returns student details as string.
     * 
     * @return student details
     */
    @Override
    public String toString() {
        return id + "," + name + "," + marks;
    }
}
    