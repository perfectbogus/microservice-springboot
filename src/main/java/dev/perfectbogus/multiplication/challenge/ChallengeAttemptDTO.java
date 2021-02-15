package dev.perfectbogus.multiplication.challenge;

import lombok.Value;

@Value
public class ChallengeAttemptDTO {
    int factorA;
    int factorB;
    String userAlias;
    int guess;
}
