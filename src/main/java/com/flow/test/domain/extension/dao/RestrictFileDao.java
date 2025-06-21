package com.flow.test.domain.extension.dao;

import com.flow.test.domain.extension.record.ExtensionInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RestrictFileDao {
    Long createResExtention(ExtensionInfo params);

    Long delResExtention(String param);
    List<ExtensionInfo> getResExtentionList();

}
