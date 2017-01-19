# Java Client of Zalando's API

This project is a Java client for the public [Zalando's API](https://github.com/zalando/shop-api-documentation). The 
client is based on a fluent java api that maps the cascade of methods to the Zalando's api endpoints. For example:

```java
PaginableResult<Brand> brands = zalandoApi.brands().pageSize(10).name("nike").get();
```
Maps to the request:

```shell
curl -XGET 'https://api.zalando.com/brands?pageSize=10&name=nike'
```

## Compilation

```shell
mvn compile
```

## Usage

First you have to install the maven artifact locally

```shell
mvn install
```

Then add the artifact to your dependencies:

```xml
<dependencies>
    ...
    <dependency>
        <groupId>org.stilavia</groupId>
        <artifactId>zalando-api</artifactId>
        <version>1.0.1-SNAPSHOT</version>
    </dependency>
    ...
</dependencies>
```

And then the usage is as follows:

```java
public static void main(String[] args) throws IOException, URISyntaxException {
    ZalandoApi zalandoApi = new ZalandoApiBuilder()
                                .setDomain(Domain.es_ES)
                                .build();
    PaginableResult<Category> categories = zalandoApi.categories().pageSize(20).get();
    System.out.println(categories);
    Article article = zalandoApi.articles("TF121C066-A11").get();
    System.out.println(article);
}
```

To use this client in a Spring application consider the following setup:

```java
@Configuration
public class ZalandoApiConfiguration {

    @Bean
    public ZalandoApi zalandoApi(@Value("${zalando-api.domain:es_ES}") Domain domain) {
        return new ZalandoApiBuilder()
                    .setDomain(domain)
                    .build();
    }
    
}
```

## Dependencies

This API depends on three other popular modules:

* `org.springframework` artifact `spring-web` version `4.3.5.RELEASE`

* `com.google.guava` artifact `guava` version `21.0`

* `com.fasterxml.jackson.core` artifact `jackson-databind` version `2.8.6`

* `org.apache.httpcomponents` artifact `httpclient` version `4.6`

Since all these artifacts are pretty popular take with care the possible artifact's version conflicts. If you are going
 to use this software under an Android device consider the [httpclient issues](https://hc.apache.org/httpcomponents-client-4.3.x/android-port.html).