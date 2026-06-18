import java.io.*;
import java.util.*;

public class FileHandler {

    public static void save(ArrayList<Student> students) {

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));

            for (Student s : students) {

                bw.write(s.toString());
                bw.newLine();

            }

            bw.close();

            System.out.println("Saved Successfully");

        } catch (Exception e) {

            System.out.println("Error Saving File");

        }

    }

    public static void load(StudentManager manager) {

        try {

            File file = new File("students.txt");

            if (!file.exists())
                return;

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int marks = Integer.parseInt(data[2]);

                manager.addStudent(new Student(id, name, marks));

            }

            br.close();

        } catch (Exception e) {

            System.out.println("Error Loading File");

        }

    }

}
