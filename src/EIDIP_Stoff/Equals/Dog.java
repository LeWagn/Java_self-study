package EIDIP_Stoff.Equals;

public class Dog {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //not implemented
    public boolean equals(Object obj) {
        return false;
    }
}
