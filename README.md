# Learning Java Benchmarking Harness

This project is used to learn Java benchmarking. The benchmarking tool itself is the 
[Oracle Java Benchmarking Harness](http://openjdk.java.net/projects/code-tools/jmh/) which
we dont use directly but as [Gradle Plugin](https://github.com/melix/jmh-gradle-plugin).

[properties](https://github.com/melix/jmh-gradle-plugin#configuration-options)


## Run

To execute all Tests in the `com.codecrafters.jmh` packed simply run

```
./gradlew clean jmh
```

## How-to

You can add new Benchmarks by adding a new method with an `@Benchmark` annotation
(same as adding tests in JUnit). 

The default configuration for every test can be made in the `build.gradle` file in the `jmh` object.
You can for example put the results into a file instead of logging it to the console by adding the
following line:
```
humanOutputFile = project.file("${project.buildDir}/reports/jmh/human.txt")
```
All configuration options can be found in the [gradle plugin documentation](https://github.com/melix/jmh-gradle-plugin#configuration-options).

However every test can be configured manually with the given JMH Annotations. Best way to
learn more about these is by looking into the [official sample tests](http://hg.openjdk.java.net/code-tools/jmh/file/tip/jmh-samples/src/main/java/org/openjdk/jmh/samples/).
