package cc.gaojie.dao;

import cc.gaojie.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author gaojie  gao4433@qq.com
 * @Description
 * @date 2022/9/21 3:55
 * @since 1.8
 */
@Mapper
public interface BookDao {

    @Select("select  * from tbl_book where id = #{id}")
    public Book getById(Integer id);
}
