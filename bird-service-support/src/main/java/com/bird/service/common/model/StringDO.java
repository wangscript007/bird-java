package com.bird.service.common.model;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author liuxx
 * @date 2019/8/22
 */
@Getter @Setter
@EqualsAndHashCode(callSuper = true)
public abstract class StringDO extends StringPureDO implements ISoftDelete,IHasCreateTime,IHasModifyTime {

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Boolean delFlag;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifiedTime;
}
