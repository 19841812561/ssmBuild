package org.example.service;

import org.example.mapper.BookMapper;
import org.example.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{
    //service调dao层：组合Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int add(Books books) {
        return bookMapper.add(books);
    }

    @Override
    public int delete(int id) {
        return bookMapper.delete(id);
    }

    @Override
    public int update(Books books) {
        return bookMapper.update(books);
    }

    @Override
    public Books select(int id) {
        return bookMapper.select(id);
    }

    @Override
    public List<Books> selectAll() {
        return bookMapper.selectAll();
    }
}
