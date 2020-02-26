package com.example.hello.hello.models;

import lombok.*;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class User {

    private final String alias;

    protected User() {
       alias = null;
    }

}
