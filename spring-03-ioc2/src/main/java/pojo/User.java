package pojo;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }
//
//    public User() {
//        System.out.println("User的无参构造");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+name);
    }
}
