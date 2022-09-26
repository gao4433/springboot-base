package cc.gaojie.utils;

import lombok.Data;

/**
 * @author gaojie  gao4433@qq.com
 * @Description
 * @date 2022/9/26 16:53
 * @since 1.8
 */
@Data
public class R {
    private Boolean flag;
    private Object data;

    public R() {
    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
