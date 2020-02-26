package com.example.hello.hello.models;

import lombok.*;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class Multiplication {
   private final int factorA;
   private final int factorB;

   Multiplication() {
      this(0, 0);
   }
}
