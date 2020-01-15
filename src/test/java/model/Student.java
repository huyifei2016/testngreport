package model;

/**
 * @author huyif
 * @Description: Student
 * @date 2019/6/24 22:47
 */
public class Student {
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
