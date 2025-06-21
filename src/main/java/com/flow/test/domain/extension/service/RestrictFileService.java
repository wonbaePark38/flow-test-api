package com.flow.test.domain.extension.service;

import com.flow.test.domain.extension.record.ExtensionInfo;

import java.util.List;

public interface RestrictFileService {
    Long createResExtention(ExtensionInfo params);

    Long delResExtention(String param);
    List<ExtensionInfo> getResExtentionList();

}
