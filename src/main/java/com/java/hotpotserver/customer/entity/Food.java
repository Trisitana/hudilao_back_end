package com.java.hotpotserver.customer.entity;

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
public class Food implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "foodId", type = IdType.AUTO)
    private Integer foodId;

    private String name;

    @TableField("foodType")
    private Integer foodType;

    private Integer repository;

    private Integer price;

    @TableField("monthSale")
    private Integer monthSale;

    private String img;


}
