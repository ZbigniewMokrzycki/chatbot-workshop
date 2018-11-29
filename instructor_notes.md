Junit dependency
```
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.3.1</version>
    <scope>test</scope>
</dependency>

```
Surfire plugin - required!
```
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>2.22.0</version>
</plugin>

```


Demo stuff on Calculator example.

Basic: plus, minus
Exceptions: div by 0
Matchers: intBetween(a, b)
Mock: isFriday

