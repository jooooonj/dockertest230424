package com.ll.docker.article.controller;

import com.ll.docker.article.Service.ArticleService;
import com.ll.docker.article.entity.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {

    private final ArticleService articleService;

    @RequestMapping("/getList")
    @ResponseBody
    public List<Article> getList() {
        return articleService.getList();
    }
}
