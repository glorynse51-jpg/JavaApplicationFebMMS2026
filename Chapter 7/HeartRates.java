public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    public HeartRates(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = month;
        this.birthDay = day;
        this.birthYear = year;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String n) { firstName = n; }
    public String getLastName() { return lastName; }
    public void setLastName(String n) { lastName = n; }
    public int getBirthMonth() { return birthMonth; }
    public int getBirthDay() { return birthDay; }
    public int getBirthYear() { return birthYear; }

    public int getAge() {
        return 2026 - birthYear;
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRate() {
        double max = getMaximumHeartRate();
        return (int)(max * 0.50) + " - " + (int)(max * 0.85) + " bpm";
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("First name: ");
        String first = input.nextLine();
        System.out.print("Last name: ");
        String last = input.nextLine();
        System.out.print("Birth month: ");
        int month = input.nextInt();
        System.out.print("Birth day: ");
        int day = input.nextInt();
        System.out.print("Birth year: ");
        int year = input.nextInt();

        HeartRates person = new HeartRates(first, last, month, day, year);
        System.out.println(person.getFirstName() + " " + person.getLastName());
        System.out.println("DOB: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
        System.out.println("Age: " + person.getAge());
        System.out.println("Maximum Heart Rate: " + person.getMaximumHeartRate());
        System.out.println("Target Heart Rate: " + person.getTargetHeartRate());
    }
}