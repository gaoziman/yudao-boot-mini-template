package cn.iocoder.yudao.module.trade.controller.admin.delivery.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 快递公司创建 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DeliveryExpressCreateReqVO extends DeliveryExpressBaseVO {

}
