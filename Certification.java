public class Certification {
    int code;
    double cost;
    String s;
    static final double LIFE_INSURANCE = 250, HEALTH_INSURANCE = 150, MORTGAGE = 350, APPRAISAL = 300,
            REGISTRATION = 50;

    public Certification(int code) {
        this.code = code;
        cost = REGISTRATION;
        s = "";
    }

    public void getCost() {
        switch (code) {
            case 1:
                cost = cost + LIFE_INSURANCE;
                s = s + "life insurance";
            case 2:
                cost = cost + HEALTH_INSURANCE;
                s = s + "Health insurance";
            case 3:
                cost = cost + MORTGAGE;
                s = s + "Mortgage";
            case 4:
                cost = cost + APPRAISAL;
                s = s + "Appraisal";
                break;
            default:
                s = "No such course is offered";
                cost = 0;
                break;
        }
    }

    public String toString() {
        return cost + " " + s;
    }
}