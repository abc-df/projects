
package com.txl.demo.controller;

import com.txl.demo.entity.EsBlog;
import com.txl.demo.service.BlogSearchService;
import org.elasticsearch.action.index.IndexResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SearchController {
    @Autowired
    private BlogSearchService blogSearchService;

    @RequestMapping(value = "/query")
    public List<EsBlog> query(@RequestParam String q) {
        List<EsBlog> search = blogSearchService.search(q, q);
        return search;
    }

    @RequestMapping(value = "/save")
    public void save(@RequestBody EsBlog esBlog) {
        blogSearchService.save(esBlog);
    }

    @RequestMapping(value = "/update")
    public void updata(@RequestBody EsBlog esBlog) {
        blogSearchService.update(esBlog);
    }


    @RequestMapping(value = "/delete")
    public void delete(@RequestParam Integer id) {
        blogSearchService.delete(id);
    }




}