package com.example.hello.hello;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomGeneratorServiceImpl implements RandomGeneratorService {
    final static int MINIMUM_FACTORIAL = 11;
    final static int MAXIMUM_FACTORIAL = 99;

    @Override
    public int generateRandomFactor() {
        return new Random().nextInt(MAXIMUM_FACTORIAL - MINIMUM_FACTORIAL + 1) + MINIMUM_FACTORIAL;
    }
}
