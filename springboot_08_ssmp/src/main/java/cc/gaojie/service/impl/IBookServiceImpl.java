package cc.gaojie.service.impl;

import cc.gaojie.dao.BookDao;
import cc.gaojie.domain.Book;
import cc.gaojie.service.IBookService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gaojie  gao4433@qq.com
 * @Description
 * @date 2022/9/24 23:19
 * @since 1.8
 */
@Service
public class IBookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public Boolean modify(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        bookDao.selectPage(page, null);
        return page;
    }

    @Override
    public IPage<Book> getPage(Integer currentPage, Integer pageSize, Book queryBook) {
        IPage page = new Page(currentPage, pageSize);
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(Strings.isNotEmpty(queryBook.getName()), Book::getName, queryBook.getName());
        lqw.like(Strings.isNotEmpty(queryBook.getType()), Book::getType, queryBook.getType());
        lqw.like(Strings.isNotEmpty(queryBook.getDescription()),
                Book::getDescription, queryBook.getDescription());
        return bookDao.selectPage(page, lqw);
    }

}
