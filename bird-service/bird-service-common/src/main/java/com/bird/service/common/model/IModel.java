package com.bird.service.common.model;

import java.io.Serializable;

/**
 * @author liuxx
 * @date 2018/2/27
 */
public interface IModel<TKey extends Serializable> extends Serializable {

    /**
     * 获取id
     * @return
     */
    TKey getId();

    /**
     * 设置id
     * @param id
     */
    void setId(TKey id);
}
