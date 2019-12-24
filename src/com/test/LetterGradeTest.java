package com.test;

import com.zxjte9411.LetterGrade;
import com.zxjte9411.Main;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LetterGradeTest {
    Main main;
    LetterGrade letterGrade;
    @BeforeEach
    void setUp() {
        main = new Main();
        letterGrade = new LetterGrade();
    }
    @AfterEach
    void tearDown() {
        main = null;
        letterGrade = null;
    }
    @Test
    void letterGradeProblem4a() {
        Assert.assertEquals(LetterGrade.letterGrade(91), 'A');
        Assert.assertEquals(LetterGrade.letterGrade(88), 'B');
        Assert.assertEquals(LetterGrade.letterGrade(77), 'C');
        Assert.assertEquals(LetterGrade.letterGrade(66), 'D');
        Assert.assertEquals(LetterGrade.letterGrade(44), 'F');
        Assert.assertEquals(LetterGrade.letterGrade(-1), 'X');
    }

    @Test
    void letterGradeProblem4b() {
        Assert.assertEquals(LetterGrade.letterGrade(99), 'A');
        Assert.assertEquals(LetterGrade.letterGrade(101), 'X');
        Assert.assertEquals(LetterGrade.letterGrade(100), 'A');
        Assert.assertEquals(LetterGrade.letterGrade(90), 'A');
        Assert.assertEquals(LetterGrade.letterGrade(91), 'A');
        Assert.assertEquals(LetterGrade.letterGrade(99), 'A');
        Assert.assertEquals(LetterGrade.letterGrade(89), 'B');
        Assert.assertEquals(LetterGrade.letterGrade(81), 'B');
        Assert.assertEquals(LetterGrade.letterGrade(89), 'B');
        Assert.assertEquals(LetterGrade.letterGrade(70), 'C');
        Assert.assertEquals(LetterGrade.letterGrade(71), 'C');
        Assert.assertEquals(LetterGrade.letterGrade(79), 'C');
        Assert.assertEquals(LetterGrade.letterGrade(69), 'D');
        Assert.assertEquals(LetterGrade.letterGrade(60), 'D');
        Assert.assertEquals(LetterGrade.letterGrade(61), 'D');
        Assert.assertEquals(LetterGrade.letterGrade(59), 'F');
        Assert.assertEquals(LetterGrade.letterGrade(1), 'F');
        Assert.assertEquals(LetterGrade.letterGrade(0), 'F');
        Assert.assertEquals(LetterGrade.letterGrade(-1), 'X');
    }
}