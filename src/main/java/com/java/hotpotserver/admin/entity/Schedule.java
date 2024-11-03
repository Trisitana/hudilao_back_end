package com.java.hotpotserver.admin.entity;

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
public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("employeeId")
    private Integer employeeId;

    @TableField("mondayMorning")
    private Integer mondayMorning;

    @TableField("mondayAfternoon")
    private Integer mondayAfternoon;

    @TableField("tuesdayMorning")
    private Integer tuesdayMorning;

    @TableField("tuesdayAfternoon")
    private Integer tuesdayAfternoon;

    @TableField("wednesdayMorning")
    private Integer wednesdayMorning;

    @TableField("wednesdayAfternoon")
    private Integer wednesdayAfternoon;

    @TableField("thursdayMorning")
    private Integer thursdayMorning;

    @TableField("thursdayAfternoon")
    private Integer thursdayAfternoon;

    @TableField("fridayMorning")
    private Integer fridayMorning;

    @TableField("fridayAfternoon")
    private Integer fridayAfternoon;


}
