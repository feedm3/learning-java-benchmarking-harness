# Learning Java Benchmarking Harness

This project is used to learn Java benchmarking. The benchmarking tool itself is the 
[Oracle Java Benchmarking Harness](http://openjdk.java.net/projects/code-tools/jmh/) which
we dont use directly but as [Gradle Plugin](https://github.com/melix/jmh-gradle-plugin).

## Run

To execute all Tests in the `com.codecrafters.jmh` package simply run

```
./gradlew clean jmh
```

By default all JMH tests must be in the `src/jmh/java` directory. This will give you
the ability to add JMH tests to existing projects without creating an extra project.

## How-to

You can add new benchmarks by adding a new method with an `@Benchmark` annotation
(same as adding tests in JUnit). By default the test will use the configuration from the
`build.gradle` file. Of course you can manually change the configuration of every single
test by using JMH Annotations.

All possible gradle JMH properties can be found on the [gradle plugin documentation](https://github.com/melix/jmh-gradle-plugin#configuration-options).
Best way to learn more about the Annotations is by looking into the [official sample tests](http://hg.openjdk.java.net/code-tools/jmh/file/tip/jmh-samples/src/main/java/org/openjdk/jmh/samples/).
