package myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

import myapp.user.domain.User;
import myapp.user.domain.UserRepository;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
public class Application implements CommandLineRunner {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = userRepository.findOne(1);
        
        System.out.println("=======================================================");
        System.out.println(user);
        System.out.println("=======================================================");

        user = new User(5, "hogehoge");
        userRepository.save(user);
    }
}

