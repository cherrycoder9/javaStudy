import java.io.*;

public class CharIOExam2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new FileReader("src/Box.java"));
            pw = new PrintWriter(new FileWriter("test.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                pw.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (pw != null) {
                pw.close();
            }
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
