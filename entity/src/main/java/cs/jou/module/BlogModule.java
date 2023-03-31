package cs.jou.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

public final class BlogModule {
    private BlogModule() {}

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class List {
        private Long id;
        private String text;
        private Long replay;
        private Long appreciate;

        public static List of(Blog dao) {
            List list = new List();

            BeanUtils.copyProperties(dao, list);

            return list;
        }
    }
}
