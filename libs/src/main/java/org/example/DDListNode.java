package org.example;

import java.util.Objects;

public class DDListNode {
    Integer value;
    DDListNode next;
    DDListNode pre;

    public DDListNode(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DDListNode that = (DDListNode) o;
        return Objects.equals(value, that.value) && Objects.equals(next, that.next) && Objects.equals(pre, that.pre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next, pre);
    }
}


