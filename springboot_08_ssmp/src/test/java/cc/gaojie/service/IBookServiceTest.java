package cc.gaojie.service;

import cc.gaojie.domain.Book;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IBookServiceTest {

    @Autowired
    private IBookService iBookService;

    @Test
    void testGetById() {
        System.out.println(iBookService.getById(4));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("测试02");
        book.setType("测试02");
        book.setDescription("测试02");
        System.out.println(iBookService.save(book));
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(14);
        book.setName("测试02");
        book.setType("测试02");
        book.setDescription("测试02");
        System.out.println(iBookService.updateById(book));
    }

    @Test
    void testDelete() {
        System.out.println(iBookService.removeById(18));
    }


    @Test
    void testGetAll() {
        System.out.println(iBookService.list());
    }

    @Test
    void testGetPage() {
        IPage<Book> page = new Page(2, 5);
        iBookService.page(page);
        System.out.println(page.getRecords());
    }

}