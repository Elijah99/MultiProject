package com.epam.task.second;

import com.epam.task.gradle.StringUtils;
import java.util.stream.Stream;

public class Utils {

    public boolean isAllPositiveNumbers(String... str) {
        StringUtils utils = new StringUtils();
        return Stream.of(str).allMatch(number -> utils.isPositiveNumber(number));
    }

}
