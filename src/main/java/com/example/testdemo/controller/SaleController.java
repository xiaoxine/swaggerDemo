package com.example.testdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 *@Author: long
 *@CreateTime: 2022-10-11  16:18
 *@Description: 销售模块
 *@Version: 1.0
 */
//@RestController:是@ResponseBody和@Controller的合体,
// @ResponseBody：返回的数据是直接传到浏览器而不是跳到某个页面;@Controller：注解控制器来处理请求
@RestController
//来处理/api/sale请求
@RequestMapping(value = "api/sale")
//@Api：修饰整个类，描述Controller的作用
@Api(description = "销售模块")
public class SaleController {
    //@ApiOperation：描述一个类的一个方法，或者说一个接口
    @ApiOperation(value = "获取销售单")
    @RequestMapping(value = "/findSaleNo", method = RequestMethod.GET)
    public String findSaleNo(@RequestParam(required = false) String saleNo) {
        if (saleNo == null) {
            return "销售订单为空";
        } else {
            return "销售订单：" + saleNo;
        }
    }

    @ApiOperation(value = "保存销售单")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody Map map) {
        if (map.containsKey("saleNo")) {
            return "销售订单存在";
        } else {
            return "销售订单不存在";
        }
    }

    @ApiOperation(value = "99乘法表")
    @RequestMapping(value = "/test99", method = RequestMethod.POST)
    public String test(@RequestBody int b) {
        for(int i =1 ;i<10; i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");

            }
            System.out.println();
        }
        return " ";
    }
}
