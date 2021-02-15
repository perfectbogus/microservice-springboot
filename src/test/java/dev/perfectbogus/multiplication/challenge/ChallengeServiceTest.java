package dev.perfectbogus.multiplication.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

public class ChallengeServiceTest {

    private ChallengeService challengeService;

    @BeforeEach
    public void setUp(){
        challengeService = new ChallengeServiceImpl();
    }

    @Test
    public void checkCorrectAttemptTest(){
        //Given
        ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50, 60, "John Doe", 3000);

        //When
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);

        //then
        then(resultAttempt.isCorrect()).isTrue();
    }

    @Test
    public void checkWrongAttemptTest(){
        //Given
        ChallengeAttemptDTO attemptDTO = new ChallengeAttemptDTO(50,60, "John Doe", 5000);

        //When
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(attemptDTO);

        //then
        then(resultAttempt.isCorrect()).isFalse();
    }
}
