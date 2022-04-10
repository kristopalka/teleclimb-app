package com.teleclimb;

import com.google.gson.Gson;
import com.teleclimb.config.GsonConfig;
import com.teleclimb.enums.Discipline;
import com.teleclimb.rest.dto.results.ResultBouldering;
import com.teleclimb.rest.dto.results.ResultLead;
import com.teleclimb.rest.dto.results.ResultSpeed;
import com.teleclimb.util.ResultChecker;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertThrows;

public class ResultCheckerTest {
    private final Gson gson = GsonConfig.gson();

    @Test
    public void lead() {
        Discipline discipline = Discipline.LEAD;

        String empty = gson.toJson(new ResultLead(null, null, LocalTime.now()));
        String wrongObject = gson.toJson(new ResultSpeed(true, false, LocalTime.of(1, 1, 1)));
        String correct = gson.toJson(new ResultLead(17, true, LocalTime.of(0, 3, 1)));


        assertThrows(RuntimeException.class, () -> ResultChecker.check(empty, discipline));
        assertThrows(RuntimeException.class, () -> ResultChecker.check(wrongObject, discipline));
        ResultChecker.check(correct, discipline);
    }

    @Test
    public void bouldering() {
        Discipline discipline = Discipline.BOULDERING;

        String empty = gson.toJson(new ResultBouldering(null, null, null, null, null));
        String wrongObject = gson.toJson(new ResultSpeed(true, false, LocalTime.of(1, 1, 1)));
        String correct = gson.toJson(new ResultBouldering(5, true, 4, true, 5));
        String correct2 = gson.toJson(new ResultBouldering(14, true, 1, false, null));
        String incorrect = gson.toJson(new ResultBouldering(14, true, 15, true, null));
        String incorrect2 = gson.toJson(new ResultBouldering(14, false, -1, true, 1));


        assertThrows(RuntimeException.class, () -> ResultChecker.check(empty, discipline));
        assertThrows(RuntimeException.class, () -> ResultChecker.check(wrongObject, discipline));
        ResultChecker.check(correct, discipline);
        ResultChecker.check(correct2, discipline);
        assertThrows(RuntimeException.class, () -> ResultChecker.check(incorrect, discipline));
        assertThrows(RuntimeException.class, () -> ResultChecker.check(incorrect2, discipline));
    }
}
