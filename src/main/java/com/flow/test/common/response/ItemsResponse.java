package com.flow.test.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.util.List;

/**
 * 공통 복수 객체 응답 Record
 */
@Builder
public record ItemsResponse<T>(
        HttpStatus status,

        List<T> items
) {
}
