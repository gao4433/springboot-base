package cc.gaojie.service.impl;

import cc.gaojie.dao.BookDao;
import cc.gaojie.domain.Book;
import cc.gaojie.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author gaojie  gao4433@qq.com
 * @Description
 * @date 2022/9/24 23:19
 * @since 1.8
 */
@Service
public class IBookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
}
