package com.silentbutmad.service;

import com.silentbutmad.binding.Student;
import com.silentbutmad.entity.StudentEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.List;

@Service
public class FormService {

    public List getCourses()
    {
        return Arrays.asList("-select-","Java","Html","Node.js","JavaScript");
    }

    public List getTimings()
    {
        return Arrays.asList("Morning","Afternoon","Evening");
    }

}
