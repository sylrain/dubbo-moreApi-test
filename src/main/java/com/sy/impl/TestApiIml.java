package com.sy.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sy.TestApi1;
import com.sy.TestApi2;

//xml 方式@Service
@Service(version="1.0.1")
public class TestApiIml implements TestApi1,TestApi2 {
}
