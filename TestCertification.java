import javax.swing.JOptionPane;

public class TestCertification {
    public static void main(String[] arg) {
        int x = GetData.getInt("1. Life insurance\n 2. Health insurance\n 3. Mortgage\n 4. Appraisal\n Make selection");
        Certification c = new Certification(x);
        c.getCost();
        System.out.println(c);

    }
}