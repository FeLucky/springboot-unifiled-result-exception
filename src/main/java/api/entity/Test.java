package api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * @author wangtiexiang
 * @Description
 * @Datetime 2020/3/23 5:30 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Test {
    private Integer id;
    private String info;
}
