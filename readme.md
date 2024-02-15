# Пример использования springdoc

Spring-doc это по сути интеграция swagger в spring. Подключается так
```kotlin
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-api:2.3.0")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.3.0")
```
Хорошо интгрируется со Spring Boot 3.X.X


Некоторые аннотации (из swagger) просто заменяются
- @ApiOperation -> @Operation
- @ApiParam -> @Parameter


Настраивается через параметры в application.yml
```yaml
springdoc:
  api-docs.path: /api-docs
  swagger-ui.path: /swagger-ui.html
```
Таким образом ссылка на приложение будет
```
http://localhost:8081/swagger-ui.html
```
редиректит на
```
http://localhost:8081/swagger-ui/index.html
```
При настройке безопастности учесть все пути spring-doc
