package com.example.article.controller;


import com.example.article.entities.Article;
import com.example.article.repository.artRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class artController {



    @Autowired
    artRepository po;


    @PostMapping("/addart")
    public Article createArt(@RequestBody Article cat) {
        return po.save(cat);
    }


    @PutMapping("/affecterArt/{uid}/{pid}")
    public void affecterArt(@PathVariable("uid") Long Id,
                            @PathVariable("pid") Long Idp) {



        Article art = po.findById(Id).get();

        po.save(art);



    }

}
