public class Student extends User{
    private String  subject;

    public Student() {
    }

    public Student( String name, String password, String subject) {
        super( name, password);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayData() {
        System.out.println("Student{" +
                "ID='" + super.getId() + '\'' +
                "Name='" + super.getName() + '\'' +
                "Password='" + super.getPassword() + '\'' +
                "subject='" + subject + '\'' +
                '}');
    }
}
