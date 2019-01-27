echo 将项目的pom放到同级目录运行
call mvn -f pom.xml dependency:copy-dependencies
@pause