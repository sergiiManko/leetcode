package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Serhii Manko
 */
class SwapLinkedListTest {
    @Test
    void testEmptyList() {
        SwapLinkedList swapper = new SwapLinkedList();
        assertNull(swapper.swapPairs(null), "Swapping an empty list should return null");
    }

    @Test
    void testSingleElementList() {
        SwapLinkedList swapper = new SwapLinkedList();
        SwapLinkedList.ListNode head = new SwapLinkedList.ListNode(1);
        SwapLinkedList.ListNode result = swapper.swapPairs(head);
        assertTrue(compareLists(head, result), "List with one element should remain unchanged");
    }

    @Test
    void testTwoElementsList() {
        SwapLinkedList swapper = new SwapLinkedList();
        SwapLinkedList.ListNode head = listFromArray(new int[]{1, 2});
        SwapLinkedList.ListNode expected = listFromArray(new int[]{2, 1});
        SwapLinkedList.ListNode result = swapper.swapPairs(head);
        assertTrue(compareLists(expected, result), "List with two elements should swap");
    }

    @Test
    void testThreeElementsList() {
        SwapLinkedList swapper = new SwapLinkedList();
        SwapLinkedList.ListNode head = listFromArray(new int[]{1, 2, 3});
        SwapLinkedList.ListNode expected = listFromArray(new int[]{2, 1, 3});
        SwapLinkedList.ListNode result = swapper.swapPairs(head);
        assertTrue(compareLists(expected, result), "List with three elements should swap first two");
    }

    @Test
    void testMultipleElementsList() {
        SwapLinkedList swapper = new SwapLinkedList();
        SwapLinkedList.ListNode head = listFromArray(new int[]{1, 2, 3, 4});
        SwapLinkedList.ListNode expected = listFromArray(new int[]{2, 1, 4, 3});
        SwapLinkedList.ListNode result = swapper.swapPairs(head);
        assertTrue(compareLists(expected, result), "List with multiple elements should swap in pairs");
    }

    private SwapLinkedList.ListNode listFromArray(int[] values) {
        SwapLinkedList.ListNode dummy = new SwapLinkedList.ListNode(0);
        SwapLinkedList.ListNode current = dummy;
        for (int value : values) {
            current.next = new SwapLinkedList.ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    private boolean compareLists(SwapLinkedList.ListNode l1, SwapLinkedList.ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
}