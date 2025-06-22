package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @Autowired
    StudentServiceImpl studentServiceImpl;

    @GetMapping("/register")
    public String register(Model model){
        StudentEntity student = new StudentEntity();
        model.addAttribute("student", student);
        return "registrationform.html";
    }

    @PostMapping("/register")
    public String register_user(@ModelAttribute StudentEntity student){
        studentServiceImpl.registerStudent(student);
        return "successful";
    }
}
