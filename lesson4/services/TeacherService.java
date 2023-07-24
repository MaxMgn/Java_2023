package lesson4.services;

import lesson4.models.Student;
import lesson4.models.Teacher;
import lesson4.models.User;
import lesson4.repositories.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private final UserRepository<Teacher> userRepository;


    public TeacherService(UserRepository<Teacher> userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {
        userRepository.create(new Teacher(fullName, age, phoneNumber, groupTitle));
    }

    @Override
    public List<Teacher> getAll() {
        List<Teacher> teachers = userRepository.getAll();
        Collections.sort(teachers);
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortByFullName() {
        List<Teacher> teachers = userRepository.getAll();
        teachers.sort(Comparator.comparing(User::getFullName));
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortById() {
        List<Teacher> teachers = userRepository.getAll();
        teachers.sort(Comparator.comparing(User::getId));
        return teachers;
    }

    @Override
    public int remove(String fullName) {return userRepository.remove(fullName);}

    @Override
    public List<Teacher> getAllByTitle(String groupTitle) {
        return userRepository.getAllByGroupTitle(groupTitle);
    }
}
