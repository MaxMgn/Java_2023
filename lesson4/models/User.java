package lesson4.models;

import java.util.Comparator;


public abstract class User implements Comparable<User> {
    private Long id;
    private String fullName;
    private Integer age;
    private String phoneNumber;
    private String groupTitle;

    public User(String fullName, Integer age, String phoneNumber, String groupTitle) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.groupTitle = groupTitle;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    @Override
    public int compareTo(User o) {
        return getAge().compareTo(o.getAge());
/*        return Comparator.comparing(U)
                .thenComparing(getAge())
                .compare(this, o)*/
    }
}
