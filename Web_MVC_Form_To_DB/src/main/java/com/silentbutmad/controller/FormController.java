package com.silentbutmad.controller;

import com.silentbutmad.binding.Student;
import com.silentbutmad.entity.StudentEntity;
import com.silentbutmad.repo.StudentEntityRepo;
import com.silentbutmad.service.FormService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@Controller
public class FormController {

    @Autowired
    StudentEntityRepo repo;
    @GetMapping("/")
    public String loadForm(Model model)
    {
        init(model);
        return "index";
    }

    public void init(Model model)
    {
        Student s =new Student();
        model.addAttribute("student",s);
        FormService service=new FormService();
        model.addAttribute("courses",service.getCourses());
        model.addAttribute("timings",service.getTimings());
    }
    @PostMapping("/save")
    public String save(Student s,Model model)
    {
        System.out.println(s);
        StudentEntity entity=new StudentEntity();
        BeanUtils.copyProperties(s,entity);
        entity.setTimings(Arrays.toString(s.getTimings()));
        repo.save(entity);
        model.addAttribute("msg","Data save...");
        init(model);
        return "index";

    }

}
