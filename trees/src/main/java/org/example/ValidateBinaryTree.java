package org.example;


import java.util.List;

public class ValidateBinaryTree {
    public boolean validate(List<Integer> tree) {
        return validate(tree, tree.get(0), 1, tree.size() - 1);
    }

    boolean validate(List<Integer> tree, Integer root, int left, int right) {
          if (left >= right) {
            return true;



        }
        int i = left;
        int mid;
        for (; i <= right; i++) {
            if (tree.get(i) > root) {
                break;
            }
        }
        mid = i;
        for (; i <= right; i++) {
            if (tree.get(i) < root) {
               return  false;
            }
        }

        return validate(tree, tree.get(left), left + 1, mid) && validate(tree, tree.get(mid), mid + 1, right);


    }

}
