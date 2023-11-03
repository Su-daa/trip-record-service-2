package com.ybe.ybe_toyproject2.global.common.annotation;

import com.ybe.ybe_toyproject2.global.error.response.ErrorResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.*;

@Target({ ElementType.METHOD, ElementType.TYPE, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@ApiResponses(value = {
        @ApiResponse(responseCode = "409", description = "클라이언트에서 잘못된 데이터 전송", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
        @ApiResponse(responseCode = "500", description = "서버 내부에서 핸들링되지 않은 예외 발생", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))

})
public @interface FailApiResponses {

}