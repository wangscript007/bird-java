package com.bird.service.common.trace;

import com.bird.service.common.trace.define.FieldTraceDefinition;

import java.util.List;

/**
 * @author shaojie
 */
public interface IFieldTraceRecorder {

    /**
     * 记录信息
     *
     * @param record 字段更新记录列表
     */
    void record(List<FieldTraceDefinition> record);
}
