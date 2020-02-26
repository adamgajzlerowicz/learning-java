package com.example.hello.hello;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomGeneratorServiceImplTest {

    public RandomGeneratorServiceImpl randomGeneratorService;

    @Test
    public void generateRandomFactorsBetweenExpectedLimits() {
        List<Integer> randomFactors = IntStream.range(0, 1000)
            .map(i -> randomGeneratorService.generateRandomFactor())
            .boxed()
            .collect(Collectors.toList());
        System.out.println(randomFactors);

        assertThat(randomFactors).containsOnlyElementsOf(IntStream.range(11, 100)
            .boxed()
            .collect(Collectors.toList()));
    }
}
