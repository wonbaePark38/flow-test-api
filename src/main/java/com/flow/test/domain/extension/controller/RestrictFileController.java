package com.flow.test.domain.extension.controller;

import com.flow.test.common.response.ItemResponse;
import com.flow.test.common.response.ItemsResponse;
import com.flow.test.domain.extension.record.ExtensionInfo;
import com.flow.test.domain.extension.service.RestrictFileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 1. 체크박스/추가버튼 클릭했을때 db insert
 * 2.
 */

/**
 * author : wonbae
 * 제한확장자 요청받는 컨트롤러
 */
@RestController
@CrossOrigin(allowedHeaders = "*")
@RequiredArgsConstructor
public class RestrictFileController {
    private final RestrictFileService restrictFileService;
    /**
     * author: 박원배
     * desc: 제한확장자 추가
     * @return 제한확장자 리스트
     */
    @GetMapping(value = "/fix/extensions", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ItemsResponse<ExtensionInfo>> selectExten() {
        List<ExtensionInfo> response = restrictFileService.getResExtentionList();
        return ResponseEntity.ok()
                .body(ItemsResponse.<ExtensionInfo> builder()
                        .status(HttpStatus.OK)
                        .items(response)
                        .build());
    }

    /**
     * author: 박원배
     * desc: 제한확장자 추가
     * @param requestObj 추가할 확장자 오브젝트
     * @return 응답객체
     */
    @PostMapping(value = "/fix/extensions", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> insertFixedExtension(@RequestBody ExtensionInfo requestObj) {
        Long response = restrictFileService.createResExtention(requestObj);
        return ResponseEntity.ok()
                .body(ItemResponse.<Long>builder()
                        .status(HttpStatus.OK)
                        .item(response)
                        .build());
    }

    /**
     * author: 박원배
     * desc: 제한확장자 삭제
     * @param extName 확장자명
     * @return 응답객체
     */
    @DeleteMapping(value = "/fix/extensions/{extName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ItemResponse<Long>> deleteFixedExtension(@PathVariable("extName") String extName) {
        Long response = restrictFileService.delResExtention(extName);
        return ResponseEntity.ok()
                .body(ItemResponse.<Long>builder()
                        .status(HttpStatus.OK)
                        .item(response)
                        .build());
    }
}
