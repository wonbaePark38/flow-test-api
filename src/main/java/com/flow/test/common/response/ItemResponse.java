package com.flow.test.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import org.springframework.http.HttpStatus;

/**
 * 공통 단일 객체 응답 Record
 */
@Builder
public record ItemResponse<T>(
        HttpStatus status,
        T item
) {
}