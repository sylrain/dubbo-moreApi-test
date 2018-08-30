/**
 * 测试可否两个dubbo 的 interface 使用同一个实现
 *
 * 第一种 xml方式 具体看dubbo-provicer.xml 不行 启动会报错 The class com.sy.impl.TestApiIml unimplemented interface interface com.sy.TestApi1!
 *
 * 第二种 dubbo注解方式 实现类不继承任何接口 启动会报错@Service interfaceClass() or interfaceName() or interface class must be present!
 *
 * 第三种 dubbo注解方式 实现类继承多个接口 可启动，有第一个接口注册在zk上
 *
 * 另注意 Application不能直接放在main/java下 会报错
 */
package com.sy;
