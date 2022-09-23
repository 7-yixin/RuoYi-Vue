package com.ruoyi.controller;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.service.BookService;
import com.ruoyi.study.domain.Book;

@RestController
@RequestMapping("/study/book")
public class BookController extends BaseController{
	@Autowired
	private BookService bookService;
	
	@GetMapping("/list")
	public AjaxResult book(){
		List<Book> list = bookService.list();
		return AjaxResult.success(list);
	}
	
	// 添加
	@PostMapping("/addbook")
	public AjaxResult addBook(Book book){
		
		book.setName("shabidongxi");
		book.setAuthor("ying");
		book.setBookNum(250);
		book.setStatus(0);
		book.setAddTime(new Date());
		book.setUpdateTime(new Date());
		
		AjaxResult act = bookService.addBook(book);
		return act;
	}
	
	@PostMapping("/delete")
	public AjaxResult delete(Integer bid){
		bid = 1002;
		AjaxResult actResult = bookService.delete(bid);
		return AjaxResult.success(actResult);
	}
	
	@PostMapping("/update")
   	public AjaxResult update(Book book) {
		book.setId(1001);
		book.setStatus(1);
   	    if(book==null||book.getId()==null) {
   	    	return AjaxResult.error("参数错误");
   	    }
    	AjaxResult act=bookService.update(book);
   		return act;
   	}
	
	

}
