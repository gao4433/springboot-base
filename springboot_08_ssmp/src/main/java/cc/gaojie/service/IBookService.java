package cc.gaojie.service;

import cc.gaojie.domain.Book;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author gaojie  gao4433@qq.com
 * @Description
 * @date 2022/9/24 23:18
 * @since 1.8
 */
public interface IBookService extends IService<Book> {

    //追加的操作与原始操作通过名称区分，功能类似
    Boolean modify(Book book);

    Boolean delete(Integer id);

    IPage<Book> getPage(int currentPage, int pageSize);
}
