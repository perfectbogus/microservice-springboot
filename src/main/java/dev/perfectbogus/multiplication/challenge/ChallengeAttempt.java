package dev.perfectbogus.multiplication.challenge;

import dev.perfectbogus.multiplication.user.User;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Indentifies the attempt from a (@link User} to solve a challenge.
 */
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class ChallengeAttempt {
    private Long id;
    private User user;
    private int factorA;
    private int facterB;
    private int resultAttempt;
    private boolean correct;
}
