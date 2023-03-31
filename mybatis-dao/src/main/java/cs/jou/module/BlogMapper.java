package cs.jou.module;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogMapper extends BaseMapper<Blog> {
    List<Blog> selectByName(@Param("wxNickName") String name);
}
