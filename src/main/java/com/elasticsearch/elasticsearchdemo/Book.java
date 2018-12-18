package com.elasticsearch.elasticsearchdemo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @version $Id: Book, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年12月18日 15:23 胡晓磊 Exp $
 */
@Document(indexName = "book", type = "novel")
public class Book {
    @Id
    private Integer id;

    @JsonProperty("book_name")
    private String bookName;

    @JsonProperty("author")
    private String author;

    @JsonProperty("publish_date")
    private Date publishDate;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>bookName</tt>.
     *
     * @return property value of bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Setter method for property <tt>bookName</tt>.
     *
     * @param bookName value to be assigned to property bookName
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * Getter method for property <tt>author</tt>.
     *
     * @return property value of author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Setter method for property <tt>author</tt>.
     *
     * @param author value to be assigned to property author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Getter method for property <tt>publishDate</tt>.
     *
     * @return property value of publishDate
     */
    public Date getPublishDate() {
        return publishDate;
    }

    /**
     * Setter method for property <tt>publishDate</tt>.
     *
     * @param publishDate value to be assigned to property publishDate
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
