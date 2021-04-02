import datastructure.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    @Test
    void isPalindrome() {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

        assertThat(palindromeLinkedList.isPalindrome(ListNode.create(1, 2, 2, 1))).isTrue();
        assertThat(palindromeLinkedList.isPalindrome(ListNode.create(1, 2))).isFalse();
    }
}
