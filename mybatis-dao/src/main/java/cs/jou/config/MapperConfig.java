package cs.jou.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "cs.jou.module")
public class MapperConfig {
}
