package com.example.article.services;

import com.example.article.entities.Article;
import com.example.article.repository.artRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class articleService {

    @Autowired
    artRepository articleRepository;
    //getting all books record by using the method findaAll() of CrudRepository
    public List<Article> getAllArticle()
    {
        List<Article> article = new ArrayList<Article>();
        articleRepository.findAll().forEach(Article1 -> article.add(Article1));
        return article;
    }
    //getting a specific record by using the method findById() of CrudRepository
    public Article getArticleById(long id)
    {
        return articleRepository.findById(id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Article article)
    {
        articleRepository.save(article);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(long id)
    {
        articleRepository.deleteById(id);
    }
    //updating a record
    public void update(Article article, int id)
    {
         articleRepository.save(article);
    }

}
