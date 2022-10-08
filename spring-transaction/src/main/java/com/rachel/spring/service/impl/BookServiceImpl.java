package com.rachel.spring.service.impl;

import com.rachel.spring.dao.BookDao;
import com.rachel.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Rachel
 * @date 2022/8/19 15:14
 * @desciption:
 * @status
 */

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
//    @Transactional(
//        propagation = Propagation.REQUIRES_NEW
//    )
    public void buyBook(Integer bookId, Integer userId) {
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId, price);
    }
}
