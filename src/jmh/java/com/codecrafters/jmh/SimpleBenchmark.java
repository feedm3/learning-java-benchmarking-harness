package com.codecrafters.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.OutputTimeUnit;

import java.util.concurrent.TimeUnit;


public class SimpleBenchmark {

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void myFirstBenchmark() {
        String test = "";
        for (int i = 0; i < 1_000; i++) {
            test += "a";
        }
    }
}
