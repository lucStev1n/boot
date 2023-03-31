package cs.jou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cs.jou.module.Blog;
import cs.jou.module.BlogMapper;
import cs.jou.module.BlogModule;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IService<Blog>, BlogService {

    @Override
    public List<BlogModule.List> page() {
        System.out.println(baseMapper.selectByName("t"));
        return list().stream()
                .map(BlogModule.List::of)
                .collect(Collectors.toList());
    }
}
