import com.challenge.Triangle;

public class Main {

    public static void main(String[] args)  {

        try {
            // initialize object
            Triangle tr = new Triangle();

            // determine triangle type baased on user input
            tr.determineType(tr.getDimensionList());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
