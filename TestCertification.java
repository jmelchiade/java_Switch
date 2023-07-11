import javax.swing.JOptionPane;

public class TestCertification {
    public static void main(String[] arg) {

        String userInput = JOptionPane.showInputDialog(
                " 1. Life insurance\n 2. Health insurance\n 3. Mortgage\n 4. Appraisal\n Make selection");
        int x = Integer.parseInt(userInput);
        Certification c = new Certification(x);
        c.getCost();
        System.out.println("_____________________");
        System.out.println(" The cost is " + c);

    }
}