package com.fametro.usermanagement;

import com.fametro.usermanagement.entity.User;
import com.fametro.usermanagement.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private final UserRepository userRepository;

    public DatabaseSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.seedUsers();
    }

    private void seedUsers() {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("deyvison@mail.com", "deyvison123", "Deyvison Silva"));
        users.add(new User("eglany@mail.com", "eglany123", "Eglany Junior"));
        users.add(new User("hudson@mail.com", "hudson123", "Hudson Freitas"));
        users.add(new User("ruan@mail.com", "ruan123", "Ruan"));
        users.add(new User("igor@mail.com", "igor123", "Igor Bennet"));
        users.add(new User("laura@mail.com", "laura123", "Laura Beatriz"));
        users.add(new User("keven@mail.com", "keven123", "Keven Anjos"));
    }
}
