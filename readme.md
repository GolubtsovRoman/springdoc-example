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
