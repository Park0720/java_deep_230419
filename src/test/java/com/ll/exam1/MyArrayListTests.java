package com.ll.exam1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTests {
    @Test
    @DisplayName("testSize")
    void t01() {
        MyArrayList<String> list = new MyArrayList<>();
        assertThat(list.size()).isEqualTo(0);
    }
    @Test
    @DisplayName("addElement")
    void t02() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");

        assertThat(list.size()).isEqualTo(2);
    }
    @Test
    @DisplayName("getElement")
    void t03() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");

        assertThat(list.get(0)).isEqualTo("사과");
        assertThat(list.get(1)).isEqualTo("포도");
    }
    @Test
    @DisplayName("data's size increase Automatically")
    void t04() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");
        list.add("당근");

        assertThat(list.size()).isEqualTo(3);
    }
}