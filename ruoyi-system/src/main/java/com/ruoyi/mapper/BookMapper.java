package com.ruoyi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.ruoyi.study.domain.Book;

@Service
public interface BookMapper {
	List<Book> list();
	int addBook(Book book);
	int delete(Integer bid);
	int update(Book book);
}
