package com.silentbutmad.controller;

import com.silentbutmad.entity.Book;
import com.silentbutmad.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private BookRepository repo;

//    @GetMapping("/")
//    public String homePage() {
//        return "index";
//    }
    @GetMapping("/book")
    public ModelAndView getBookByID(@RequestParam("id") Integer id){
        ModelAndView mav = new ModelAndView();
        Optional<Book> data=  repo.findById(id);
        if(data.isPresent())
        {
            Book  book=data.get();
            mav.addObject("book",book);
        }
        mav.setViewName("index");
        return mav;

    }
}
