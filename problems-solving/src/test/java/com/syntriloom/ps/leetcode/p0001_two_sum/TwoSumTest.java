package com.syntriloom.ps.leetcode.p0001_two_sum;

import java.util.stream.Stream;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("leetcode")
@Tag("array")
@Tag("hashmap")
@Tag("twopointers")
public class TwoSumTest {

    static Stream<TwoSum> implementations() {
        return Stream.of(
                new TwoSumHashMap());
    }

    @ParameterizedTest
    @MethodSource("implementations")
    void shouldReturnIndicesOfTwoAndSeven_whenTargetIsNine(TwoSum impl) {
        assertThat(impl.twoSum(new int[] { 2, 7, 11, 15 }, 9))
                .containsExactlyInAnyOrder(0, 1);
    }

}
