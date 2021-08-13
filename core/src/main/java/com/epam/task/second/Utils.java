package com.epam.task.second;

import com.epam.task.gradle.StringUtils;
import java.util.stream.Stream;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        return Stream.of(str).allMatch(number -> StringUtils.isPositiveNumber(number));
    }

}
