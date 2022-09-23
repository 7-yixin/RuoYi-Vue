package com.ruoyi.service;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.study.domain.Book;

public interface BookService {
	List<Book> list();

	AjaxResult addBook(Book book);

	AjaxResult delete(Integer bid);

	AjaxResult update(Book book);

}
