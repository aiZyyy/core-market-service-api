package com.sixi.core.marketservice.domain.form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @Author: ZY
 * @Date: 2019/8/6 14:55
 * @Version 1.0
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppApplyForm {

    @NotBlank(message = "app名称不能为空")
    private String appName;

    private String companyName;
}
