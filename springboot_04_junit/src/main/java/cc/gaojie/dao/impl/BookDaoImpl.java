package cc.gaojie.dao.impl;

import cc.gaojie.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author gaojie  gao4433@qq.com
 * @Description
 * @date 2022/9/21 3:03
 * @since 1.8
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("save() running……");
    }
}
