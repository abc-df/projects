package com.txl.demo.service;

import com.txl.demo.entity.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogSearchService {
    void save (EsBlog eb);

    List<EsBlog> search(String firstname, String lastname);

    void update(EsBlog esBlog);

    void delete(Integer id);
}
