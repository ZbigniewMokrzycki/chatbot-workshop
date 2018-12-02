Junit dependency
```
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.3.1</version>
    <scope>test</scope>
</dependency>

```
Surfire plugin - required if running from maven!
```
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>2.22.0</version>
</plugin>

```

`./mvnw clean compile test`


AssertJ
```
<dependency>
    <groupId>org.assertj</groupId>
    <artifactId>assertj-core</artifactId>
    <version>3.11.1</version>
    <scope>test</scope>
</dependency>
```

JUnit @ParameterizedTest
```
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-params</artifactId>
    <version>5.3.2</version>
    <scope>test</scope>
</dependency>
```
                                            
1. Exceptions 
    * `@Test(expected = IllegalArgumentException.class)`
    * ```
      @Rule public ExpectedException thrown = ExpectedException.none();
      
      @Test
      public void myTest() {
          thrown.expect(Exception.class);
          thrown.expectMessage("Init Gold must be >= 0");
      
          rodgers = new Pirate("Dread Pirate Rodgers" , -100);
      }
      ```

2. Branch + code cov
    * Show the code cov in Idea for this class
    * Implement a new test
    * Show that assertion-less test also generates coverage!!
    * In case of Idea problems: 
        ```
        ./mvnw cobertura:cobertura
        open target/site/cobertura/index.html
        ```
    * Also: `sudo update-java-alternatives -s java-1.8.0-openjdk-amd64`

3. Parametrized
    * opowiedzieć, że są różne biblioteki eg. JUnitParams


4. Chatbot
In case chatbot server needed:
```
https://github.com/callicoder/spring-boot-websocket-chat-demo.git
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_60.jdk/Contents/Home
./mvnw spring-boot:run
```

Demo stuff on Calculator example.

Basic: plus, minus
Exceptions: div by 0
Matchers: intBetween(a, b)
Mock: isFriday


