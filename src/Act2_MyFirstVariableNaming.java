//public class MyFirstVariableNaming {
//}

class UserProfile {
    public static void main(String[] args) {
        String userName = "Terry";
        int age = 35;
        char gender = 'M';
        String job_pref = "Chef";
        String nationality = "Singaporean";
        String blood = "AB+";
        int currentYear = 2021;
        int YOB = currentYear - age;
        System.out.println("Profile detail: " + userName + ", " + age + ", " + gender + ", " + blood);
        System.out.println("Job preference: " + job_pref);
        System.out.println("Nationality: " + nationality);
        System.out.println("Year of Birth: " + YOB);
    }
}