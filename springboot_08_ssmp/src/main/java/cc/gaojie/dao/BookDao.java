package cc.gaojie.dao;

import cc.gaojie.domain.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author gaojie  gao4433@qq.com
 * @Description
 * @date 2022/9/24 13:36
 * @since 1.8
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
