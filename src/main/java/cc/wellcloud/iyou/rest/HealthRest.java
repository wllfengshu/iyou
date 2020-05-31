package cc.wellcloud.iyou.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangll
 */
@Api(tags = "健康管理")
@RestController
@RequestMapping("/health")
public class HealthRest {

    @ApiOperation(value = "健康检查", httpMethod = "GET", notes = "可用")
    @GetMapping(value = "/")
    public ResponseEntity health() {
        Map<String,Object> res = new HashMap<>();
        res.put("operation",1111);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }
}

