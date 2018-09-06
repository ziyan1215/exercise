# Mapper代理方式规范
* 在mapper.xml中namespace等于mapper接口地址
` <mapper namespace="ly.po.UserMapper"/> `
* mapper接口中的方法名和mapper.xml中statement中的id值一致
* mapper接口中的方法输入参数类型和mapper.xml中statement中的parameterType指定的类型一致
* mapper接口中的方法返回类型和mapper.xml中statement中的resultType指定的类型一致