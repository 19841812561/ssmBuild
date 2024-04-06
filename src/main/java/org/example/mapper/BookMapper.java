package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Books;

import java.util.List;

public interface BookMapper {

    //增加一本书
    int add(Books books);
    //删除一本书
    int delete(@Param("bookID") int id);
    //修改一本书
    int update(Books books);
    //查询一本书
    Books select(@Param("bookID") int id);
    //查询所有书
    List<Books> selectAll();
}
