package com.binw.simplescaffold.controller;

import com.binw.simplescaffold.service.DataProcessService;
import com.binw.simplescaffold.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(value="数据处理",tags="数据处理")
public class DataProcessController {
    @Autowired
    DataProcessService dataProcessService;

    @ResponseBody
    @RequestMapping("/test01")
    @ApiOperation(value="测试01",tags="测试")
    public R test(){
        return R.ok(dataProcessService.test01(),"查询成功");
    }

    @ResponseBody
    @RequestMapping("/test02")
    @ApiOperation(value="测试02",tags="测试")
    public R test02(){
        return R.ok(dataProcessService.test02(),"查询成功");
    }
}
