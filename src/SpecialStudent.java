public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;
    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }



    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent( long secretKey) {
        this.secretKey=secretKey;
    }
    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
