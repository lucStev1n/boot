package cs.jou.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private Long id;
    private Long uid;
    private String text;
    private Long replay;
    private Long appreciate;
    private Date createTime;
    private Date modifyTime;
}
