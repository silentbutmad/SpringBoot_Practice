package com.silentbutmad.controller;

import com.silentbutmad.binding.Student;
import com.silentbutmad.service.FormService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    @GetMapping("/")
    public String loadFormData(Model model)
    {
            setInitDataToModel(model);
            return "index";
    }

    public void setInitDataToModel(Model model)
    {
        Student s=new Student();
        FormService service=new FormService();
        model.addAttribute("student",s);
        model.addAttribute("courses" ,service.getCourses());
        model.addAttribute("timings",service.getTimings());

    }
    @PostMapping("/save")
    public String save(Student s,Model m)
    {
        System.out.println(s);
        m.addAttribute("msg","Data Saved...");
        setInitDataToModel(m);
        return "index";
    }

}
