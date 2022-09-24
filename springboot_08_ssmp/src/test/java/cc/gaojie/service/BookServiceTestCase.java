package cc.gaojie.service;

import cc.gaojie.domain.Book;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author gaojie  gao4433@qq.com
 * @Description
 * @date 2022/9/24 22:49
 * @since 1.8
 */
@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private BookService bookService;

    @Test
    void testGetById(){
        System.out.println(bookService.getById(4));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("测试01");
        book.setType("测试01");
        book.setDescription("测试01");
        System.out.println(bookService.save(book));
    }

    @Test
    void update() {
        Book book = new Book();
        book.setId(14);
        book.setName("测试02");
        book.setType("测试02");
        book.setDescription("测试02");
        System.out.println(bookService.update(book));
    }

    @Test
    void delete() {
        System.out.println(bookService.delete(17));
    }

    @Test
    void getById() {
        System.out.println(bookService.getById(12));
    }

    @Test
    void getAll() {
        System.out.println(bookService.getAll());
    }

    @Test
    void getPage() {
        IPage<Book> page = bookService.getPage(2, 5);
        System.out.println(page.getRecords());
    }
}
