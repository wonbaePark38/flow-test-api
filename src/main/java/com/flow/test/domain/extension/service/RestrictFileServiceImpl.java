package com.flow.test.domain.extension.service;

import com.flow.test.domain.extension.dao.RestrictFileDao;
import com.flow.test.domain.extension.record.ExtensionInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RestrictFileServiceImpl implements RestrictFileService{
    private final RestrictFileDao restrictFileDao;

    @Override
    @Transactional
    public Long createResExtention(ExtensionInfo params) {
        return restrictFileDao.createResExtention(params);
    }

    @Override
    public Long delResExtention(String param) {
        return restrictFileDao.delResExtention(param);
    }

    @Override
    public List<ExtensionInfo> getResExtentionList() {
        return restrictFileDao.getResExtentionList();
    }
}
