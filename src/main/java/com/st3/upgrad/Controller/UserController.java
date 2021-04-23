package com.st3.upgrad.Controller;



import com.st3.upgrad.Model.User;
import com.st3.upgrad.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;


    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }
    @GetMapping("/Signup")
    public String Signup(Model model){
        model.addAttribute("user",new User());
        return "signup";
    }
    @PostMapping("/signup_process")
    public  String UserRegistration(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
        return "register_success";

    }


}
