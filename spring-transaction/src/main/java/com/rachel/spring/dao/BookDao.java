package com.rachel.spring.dao;

/**
 * @author Rachel
 * @date 2022/8/19 15:15
 * @desciption:
 * @status
 */
public interface BookDao {
    Integer getPriceByBookId(Integer bookId);
    void updateStock(Integer bookId);
    void updateBalance(Integer userId, Integer price);
}
