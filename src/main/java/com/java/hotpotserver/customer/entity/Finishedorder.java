package com.java.hotpotserver.customer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class Finishedorder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "finishedOrderId", type = IdType.AUTO)
    private Integer finishedOrderId;

    @TableField("tableNumber")
    private Integer tableNumber;

    private Integer phonenumber;

    private Integer comment;

    private LocalDateTime time;

    @TableField("cookId")
    private Integer cookId;

    private String money;


}
