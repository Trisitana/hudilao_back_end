package com.java.hotpotserver.cook.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author fengyu
 * @since 2023-08-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Items implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "finishedOrderId", type = IdType.AUTO)
    private Integer finishedOrderId;

    @TableField("orderId")
    private Integer orderId;

    @TableField("foodType")
    private Integer foodType;

    @TableField("foodId")
    private Integer foodId;


}
