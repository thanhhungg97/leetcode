package trees;


import org.example.ValidateBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.List;

class ValidateBinaryTreeTest {
    ValidateBinaryTree tree = new ValidateBinaryTree();

    @Test
    void testcase1() {
        Assertions.assertTrue(tree.validate(List.of(1, 3, 2)));
    }

    @Test
    void testcase2() {
        Assertions.assertTrue(tree.validate(List.of(2, 1, 3)));
    }

    @Test
    void testcase3() {
        Assertions.assertTrue(tree.validate(List.of(3, 2, 1, 5, 4, 6)));

    }

    @Test
    void testcase4() {
        Assertions.assertFalse(tree.validate(List.of(1, 3, 4, 2)));

    }

    @Test
    void testcase5() {
        Assertions.assertFalse(tree.validate(List.of(3, 4, 5, 1, 2)));

    }
}