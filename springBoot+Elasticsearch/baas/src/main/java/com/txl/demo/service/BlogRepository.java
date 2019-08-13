package com.txl.demo.service;

import com.txl.demo.entity.EsBlog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.awt.*;
import java.util.List;


public interface BlogRepository extends ElasticsearchRepository<EsBlog, Long> {
    List<EsBlog> findByFirstnameLikeOrLastnameLike(String firstname, String lastname);

    EsBlog queryEsblogById(Long id);
}
