package com.quiz.innobyte.service;

import com.quiz.innobyte.model.QuizUser;
import com.quiz.innobyte.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(String username, String password) {
        QuizUser user = new QuizUser();
        user.setUserName(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setRole("USER");
        userRepository.save(user);

    }

    public boolean authenticateUser(String username, String password) {
        return userRepository.findByUserName(username)
                .map(u -> passwordEncoder.matches(password, u.getPassword()))
                .orElse(false);
    }
}
