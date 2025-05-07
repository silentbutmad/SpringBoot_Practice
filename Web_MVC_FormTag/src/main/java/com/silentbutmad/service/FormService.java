package com.silentbutmad.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class FormService {
    public List getCourses ()
    {
        return Arrays.asList("-select-","Java","Html","React","Node.js");
    }
    public List getTimings()
    {
        return Arrays.asList("Morning","Afternoon","Evening");
    }
}
