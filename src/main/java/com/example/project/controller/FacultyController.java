package com.example.project.controller;


import com.example.project.model.Faculty;
import com.example.project.repository.FacultyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/faculty")
public class FacultyController {


    private final FacultyRepository facultyRepository;

    public FacultyController(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("faculties", facultyRepository.findAll());
        model.addAttribute("add", false);
        model.addAttribute("faculty", new Faculty());
        return "faculty";
    }
}
