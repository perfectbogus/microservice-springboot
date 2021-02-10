package dev.perfectbogus.multiplication.challenge;

public interface ChallengeGeneratorService {
    /**
     * @return a randomly-generated challenge with two factors between 11 and 99
     */
    Challenge randomChallenge();
}
