package com.java.hotpotserver.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
public class Wishlist implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("phoneNumber")
    private String phoneNumber;

    private String food;


}
