# oss-s3-starter
S3-存储插件

使用：
1、引入依赖：
        <dependency>
            <groupId>com.ldm</groupId>
            <artifactId>oss-s3-starter</artifactId>
            <version>1.0</version>
        </dependency>
        
2、配置文件：
  oss.endpoint=http://192.168.XXX.XXX:9000
  oss.accessKey=minio
  oss.secretKey=minioXXX
  
3、调用：
    @Autowired
    private OwsTemplate ossTemplate;
    
  即可。
