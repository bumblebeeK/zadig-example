FROM java:openjdk-8u111-jre
#发布到网上时只会把jar包和Dockerfile发布上去
COPY /target/demo-0.0.1-SNAPSHOT.jar /app.jar
#地址映射
CMD ["--server.port=8080"]
#对外暴露端口
EXPOSE 8080
#执行命令
ENTRYPOINT ["java","-jar","/app.jar"]
