package com.ll.exam1;

import com.ll.TestUt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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

        String[] data = TestUt.getFieldValue(list, "data", null);
        assertThat(data.length).isEqualTo(2);

        list.add("사과");
        list.add("포도");

        data = TestUt.getFieldValue(list, "data", null);
        assertThat(data.length).isEqualTo(2);

        list.add("당근");

        data = TestUt.getFieldValue(list, "data", null);
        assertThat(data.length).isEqualTo(4);

        assertThat(list.size()).isEqualTo(3);
    }
    @Test
    @DisplayName("removeElement")
    void t05() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");

        list.remove(0);
        list.remove(1);

        assertThat(list.size()).isEqualTo(0);
    }
    @Test
    @DisplayName("containsElement")
    void t06() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");

        assertTrue(list.contains("사과"));
        assertFalse(list.contains("오렌지"));
    }
    @Test
    @DisplayName("indexOf")
    void t07() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");

        assertEquals(0, list.indexOf("사과"));
        assertEquals(1, list.indexOf("포도"));
        assertEquals(-1, list.indexOf("오렌지"));
    }
    @Test
    @DisplayName("dataClear")
    void t08() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");
        list.add("오렌지");
        list.clear();

        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }
}