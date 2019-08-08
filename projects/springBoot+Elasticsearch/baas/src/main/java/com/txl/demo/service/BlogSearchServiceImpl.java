package com.txl.demo.service;

import com.txl.demo.entity.EsBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springBoot+Elasticsearch
 * @description:
 * @author: txl
 * @create: 2019-08-06 16:45
 **/


@Service
public class BlogSearchServiceImpl implements BlogSearchService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public void save(EsBlog poem) {
        blogRepository.save(poem);
    }

    @Override
    public List<EsBlog> search(String firstname, String lastname) {
        return blogRepository.findByFirstnameLikeOrLastnameLike(firstname, lastname);
    }

    @Override
    public void update(EsBlog esBlog) {
        EsBlog esBlog1 = blogRepository.queryEsblogById(esBlog.getId());
        System.out.println(esBlog1.getFirstname() + "==" + esBlog1.getLastname());
        esBlog1.setLastname(esBlog.getLastname());
        blogRepository.save(esBlog1);
    }

    @Override
    public void delete(Integer id) {
        EsBlog esBlog1 = blogRepository.queryEsblogById(Long.valueOf(id));
        blogRepository.delete(esBlog1);
    }


}
