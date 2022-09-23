package com.ruoyi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.mapper.BookMapper;
import com.ruoyi.study.domain.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookMapper bookMapper;
	@Override
	public List<Book> list() {
		List<Book> list = bookMapper.list();
//		List<Book> list=new ArrayList<>();
//		Book book=new Book();
//		book.setId(1);
//		book.setName("名称");
//		list.add(book);
		return list;
	}
	
	@Override
	public AjaxResult addBook(Book book) {
		int i = bookMapper.addBook(book);
		if (i==0) {
			return AjaxResult.error("保存错误");
		}
		return AjaxResult.success("保存成功");
	}

	@Override
	public AjaxResult delete(Integer bid) {
		int i = bookMapper.delete(bid);
		if (i==0) {
			return AjaxResult.error("删除失败");
		}
		return AjaxResult.success("删除成功");
	}

	@Override
	public AjaxResult update(Book book) {
		int num=bookMapper.update(book);
		if(num==0) {
			return	AjaxResult.error("删除失败");
		}
		return AjaxResult.success();
	}

}
