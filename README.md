# Microservicios Spring Cloud Eureka & Angular Full-stack

## Sección 3: Backend: Eureka Server registrando microservicios

## Importante [2.9. JDK 11 Support](https://docs.spring.io/spring-cloud-netflix/docs/3.1.4/reference/html/#securing-the-eureka-server)
Los módulos JAXB de los que depende el servidor Eureka se eliminaron en JDK 11 [en realidad desde la 9]. Si tiene la intención de utilizar JDK 11 
[o superior] cuando ejecute un servidor Eureka, debe incluir estas dependencias en su archivo POM o Gradle.

```
<dependency>
    <groupId>org.glassfish.jaxb</groupId>
    <artifactId>jaxb-runtime</artifactId>
</dependency>
```
