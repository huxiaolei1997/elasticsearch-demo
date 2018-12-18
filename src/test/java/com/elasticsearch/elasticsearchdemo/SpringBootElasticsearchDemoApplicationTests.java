package com.elasticsearch.elasticsearchdemo;

import org.elasticsearch.index.query.MatchQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootElasticsearchDemoApplicationTests {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void queryForList() {
        SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(new MatchQueryBuilder("book_name", "mysql")).build();

        List<Book> books = elasticsearchTemplate.queryForList(searchQuery, Book.class);

        // 分页查询数据
        Pageable pageable = PageRequest.of(1, 2);
        SearchQuery searchQuery1 = new NativeSearchQueryBuilder().withPageable(pageable).withQuery(new MatchQueryBuilder("book_name", "开发")).build();

        List<Book> bookList = elasticsearchTemplate.queryForList(searchQuery1, Book.class);

        System.out.println(books.toString());

        System.out.println(bookList.toString());
    }
}

