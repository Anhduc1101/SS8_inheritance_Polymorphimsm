import java.util.Scanner;

public class User {
    private int id;
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {

        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào userName:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào password:");
        String password = scanner.nextLine();
        if (name.equals(getName().toLowerCase()) && password.equals(getPassword().toLowerCase())) {
            System.out.println("Đăng nhập thành công !");
            displayData();
        } else {
            System.out.println("Không tồn tại !");
        }
    }


    public void displayData() {
        System.out.println("User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}');
    }
}

