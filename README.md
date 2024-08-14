# spring native not support method handler with kotlin default value issue reproduction

issue: https://github.com/spring-projects/spring-framework/issues/33384

steps:

```shell
./gradlew bootBuildImage
docker run --network=host issue-reproduction
```

test:

```shell
curl localhost:8080/normal
```

this test will return normally

```shell
curl localhost:8080/defaultValue
```

but this test will return internal error
