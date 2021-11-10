## 常用依赖
```xml
    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.9</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.1</version>
        </dependency>
    </dependencies>
```

## 注解说明:
* @Autowired：byType自动装配。
* @Nullable：字段标记了这个注解，说明这个字段可以为null
* @Resource：先byName，再byType自动装配。


* @Component：组件，放在类上，说明这个类被Spring管理了，就是Bean
* 