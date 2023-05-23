import java.io.*;

public class GradeUp {
    private static String getGrade(double avg) {
        if (avg >= 95.0) {
            return "A+";
        } else if (avg >= 90.0) {
            return "A0";
        } else if (avg >= 85.0) {
            return "B+";
        } else if (avg >= 80.0) {
            return "B0";
        } else if (avg >= 75.0) {
            return "C+";
        } else if (avg >= 70.0) {
            return "C0";
        } else if (avg >= 60.0) {
            return "D+";
        } else if (avg >= 50.0) {
            return "D0";
        } else {
            return "F";
        }
    }

    private static void calc(String[] names) {
        BufferedReader brKey = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int i = 0; i < names.length;) {
            System.out.print(names[i] + ": ");

            int score;
            try {
                score = Integer.parseInt(brKey.readLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please type numbers.");
                continue;
            } catch (IOException e) {
                System.err.println(e);
                return;
            }

            if (score < 0 || score > 100) {
                System.out.println("Please type numbers between 0 and 100.");
                continue;
            }

            sum += score;
            i++;
        }

        final double avg = (double) sum / names.length;
        System.out.println("Total: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + getGrade(avg));
    }

    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("Usage: " + GradeUp.class.getSimpleName() + " subject1 subject2 ...");
        } else {
            calc(args);
        }
    }
}
