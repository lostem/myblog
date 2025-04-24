# Ubuntu 리눅스 기반 이미지 사용
FROM ubuntu:22.04

# 패키지 업데이트 및 JDK, MariaDB 설치
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk mariadb-server && \
    apt-get clean

# 환경 변수 설정
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
ENV PATH=$PATH:$JAVA_HOME/bin

# MariaDB 포트 오픈
EXPOSE 3306

# MariaDB 실행 명령
CMD ["mysqld_safe"]