package com.example.hello.hello;

import com.example.hello.hello.models.MultiplicationResultAttempt;

public interface MultiplicationService {
    Multiplication createRandomMultiplication();

    boolean checkAttempt(final MultiplicationResultAttempt multiplication);
}
