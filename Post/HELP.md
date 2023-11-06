# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.5/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.5/gradle-plugin/reference/html/#build-image)
* [Distributed Tracing Reference Guide](https://micrometer.io/docs/tracing)
* [Getting Started with Distributed Tracing](https://docs.spring.io/spring-boot/docs/3.1.5/reference/html/actuator.html#actuator.micrometer-tracing.getting-started)
* [Docker Compose Support](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#features.docker-compose)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [codecentric's Spring Boot Admin (Client)](https://codecentric.github.io/spring-boot-admin/current/#getting-started)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#using.devtools)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#io.email)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#actuator)
* [Spring Cache Abstraction](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#io.caching)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Caching Data with Spring](https://spring.io/guides/gs/caching/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### Docker Compose support
This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* postgres: [`postgres:latest`](https://hub.docker.com/_/postgres)
* zipkin: [`openzipkin/zipkin:latest`](https://hub.docker.com/r/openzipkin/zipkin/)

Please review the tags of the used images and set them to the same as you're running in production.

