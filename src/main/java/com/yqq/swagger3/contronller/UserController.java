package com.yqq.swagger3.contronller;

import com.yqq.swagger3.dto.UserDTO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 * Created by yqq on 2021/01/11
 */
@Api(tags = "用户信息处理")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation("用户获得注册验证码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "userId", paramType = "path", dataType = "string", required = true)
    })
    @ApiResponses({@ApiResponse(code = 200, message = "执行成功", response = UserDTO.class)})
    @GetMapping("/getAuthCode/{userId}")
    public UserDTO getAuthCode(@PathVariable("userId") String userId){
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(10);
        userDTO.setName("jack");
        return userDTO;
    }

}
