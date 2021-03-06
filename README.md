1.  Two Sum
    I learned that containsKey checks if a key is in a hashmap, and that .get gets the value associated with that key.
    You don't always need to have the value as the hashmap value, it can also be the index. The key should be the unique things you 
    are looking for.
          
2.  Merge Two Binary Trees
    I learned that like in AI, you should start by analyzing your cases. In our case we had easy base cases.
    Is t1 null? Just return t2, etc. For this question, think of t1 as the CURRENT left tree node, not THE ENTIRE TREE.
    after our easy cases, we have our harder case (adding them). We can use t1.val += t2.val which implies we return t1.
    We aren't done though, we need to recurs on the left and right side, like iterating through an array, like:
    t1.left = merge(t1.left, t2.left); t1.right = merge(t1.right, t2.right).
       
3.  Reverse String 
    I learned that if you have two points going from the start to finish, you may only need to iterate half
    the amount of times as usual, since you are only going until they meet. Also the general swapping algorithm goes:
    char temp = swap1
    swap1 = swap2 - i
    swap2 - i = temp; We have the -i to iterate the pointer.
       
4.  Remove Duplicates from Sorted Array
    Usually whenever you modify an array in place and have to return an index, you'll use two pointers, I also learned to analyze 
    for key information, I.E the array is sorted meaning our algorithm will check if the next element from our current is the same, if it isn't the same,
    those are two unique elements, so edit the array and update the pointer.
        
5.  Best Time To Buy and Sell Stock
    I learned that you should trace the sample input and manually in your head get to the sample output, i.e start buy coding what you are thinking.
    In our case, we went through the array and subtracted the next number by the current if the next number was bigger, if it's not do nothing. Code exactly that.
    Don't overthink problems just because they say "algorithm" or "optimize".
    
6.  Jewels and Stones
    I learned that using hashsets are useful if you wanna see if something you're iterating through is contained in something, you can just have O(n) lookup time without 
    having to loop through the second string. In our case we saved ourself from looping through the jewels to see if it's in there.
            
7. Reverse LinkedList
    I learned to iterate through a linkedlist, you'll have while(head != null). I also learned to do a problem first by hand then code it. In our case the main 
    thing to see is that because we are flipping the arrow to reverse the list, we can't remember the proper previous node and next node. We start by defining a
    prev to null (since theres nothing behind the head) and a next to null. The algorithm goes like this:
    
    1. next = curr.next | Need the next value in the list so we can actually continue iterating
    2. curr.next = prev | This is us actually flipping the arrow the other direction (reversing)
    3. prev = curr      | Set the prev to the current before moving current forward (so we can reference prev again next time)
    4. curr = next      | Finally move curr forward, we cant do curr = curr.next since we set curr.next to point backwards to prev.
    
    1 -> 2 -> 3 -> 4 
    4 -> 3 -> 2 -> 1 

8. Contains Duplicates
    I learned that you don't always need a hashmap for duplicates, hashsets work well too. 
    
9. Move Zeroes
    I Learned that if you modify an array in place, you usually need two pointers. One that goes through the whole array (i), and
    one that is only incremented on a certain case (current == 0). 
    
10. Intersection of two arrays
    I learned that if you need to return an array but you don't know the size, start with an arraylist then convert it to an 
    array. Finding if two different data structures (arrays) contain similar elements, it's useful to use a hashmap and a counter
    and decrement the counter if there is a match. 
   
11. Flood Fill
    I learned that DFS is good for finding if a path exist. It basically recurses down a tree/path/graph until it can't anymore.
    That "Can't" is usually handled by some if statement, in our case it was "if image[r][c] == color". The flood will fill, and
    dfs will recursively go until that if statement is blocked, so until we reach 4 numbers we can't fill into.

12. Number of Islands
    I learned that, again dfs is good when things connect eachother in a graph. I learned that when having dfs
    there is usually an if statement before all the recursive cases. That if statement breaks you out of dfs,
    which in our case is when we stopped finding any 1s.
    
13. Fibonacci Number
    I learned that for recrusion, you don't actually "compute" anything until the base case. This is evident 
    here because no value actually exist on the stack until fib(1) or fib(0). Memoization is good when you 
    have recursion and repeat calculations. For example if I draw a trace tree, and the right side has already
    calculated fib(5), why would the left side calculate it too? Just store it in a map and check if it exists before
    recursing down. 
    
14. Plus one
    I learned that it's good to consider the rarest case last, I.E if all if statements dont pass, outside
    the loop you can assume youve hit that really rare case, (all 9s). I also learned that problems that req
    a lot of cases, i.e 
    case 1: 1 0 0 2, ending number isnt 9, just plus one
    case 2: 1 0 0 9, ending number is 9, make it 0 and add 1 to the previous (handled by case 1)
    case 3: 9 9 9 9, make new array and set pos 0 to 1.
    It's good to set your if statements up in that order, and to re check and make sure you aren't doing redundent
    logic, in our example we don't even need an if statemment for case 2, we just need to set the pos to 0 if its 9
    and then the rest will be taken care of by case1's if statement.
    
15. Rotate Image
    I learned that if you want to rotate an image/matrix to the right the order is
        Reverse rows -> Transpose ([i][j] -> [j][i])
    If you want to rotate an image/matrix to the left (counter clockwise)
        Reverse columns -> Transpose
    This seems like a "trick" but it's really not. If you draw out a small sample nxn matrix, and try doing
    matrix operations on it, you can end up with an algorithm to get to the end.
    It's also useful to note that if you want to swap the rows or columns, you dont need to do [][], like
    you can access a whole row with matrix[r], you dont need the extra [].
    
16. Rotate Array
    I learned that rotating arrays often involved reversals. The general algorithm to shift an array k times is
        Reverse whole array
        Reverse from 0, k -1
        Reverse from k, length - 1
    This comes from an observation by viewing the final product. Also for reversing its good to have a start and
    end and do a while(start < end) type beat
    
17. Valid Sudoku
    I learned if something has a fixed input (9x9) it's prob ok to have double for loops. Once again sets are 
    good at keeping track of duplicates, you can have multiple passes and just clear the set after each pass
    to save memory.
    This problem was broken down into 3 different passes/checks
    1. Row check - Double for loop indexing by board[i][j]
    2. Column check - Double for loop indexing by board[j][i] (useful for iterating by columns first)
    3. 3x3 Check - Quadra for loop.
        First two loops iterate through a square, i.e i < 3, j < 3/
        Second two loops advance the actual square to the next square
            m = i * 3; m = i * 3 + 3; m++. Think of this as jumping to square 2 where the outer two loops just
            iterate through THAT SPECIFIC SQUARE.
            
18. Reverse Integer
    I learned that number % 10 is good at getting the last digit of a number.
    I also learned that result * 10 is a good way at advancing the 10s place.
    Ex: result = (result * 10) + num % 10
        num = num / 10;
    What this does is it takes the last digit of nums, adds it to result, and then removes that digit from nums
    the result * 10 is basically like int i = 0, it's just advancing forward on result, so the next thing to be 
    added to result goes in the next place.
    
19. First Unique Character in a String.
    I learned that if you want to increment a value with a key in a map, the syntax is map.get(key)+1 not
    ++ or +=1. Also, map.getOrDefault(map.get(key), 0) is really clean. It elimates the case where the key
    does not exist in the map and you must put it in with a 0.
    
20. Valid Anagram
    Anagram means re-arranging the word can get you the other, aka same letter frequency.
    I learned its always good to check the obvious case, i.e they obviously aren't anagrams if string 1 is 
    a different size than string 2. One again map.getOrDefault(s.charAt(i), 0) + 1 comes in handy.
    
21. Valid Palindrome
    I learned a two pointer(start and end) approach is good here. We basically check if the thing we are on is
    an actual character, if it's NOT update the start/end as much as there is invalid characters.
    
22. String to Integer atoi
    I learned that if you're converting something to an integer, or re arranging an integer, and overflow is 
    involved, you must build it into a long to check for overflow. We used a similar strategy in Reverse integer
    where we need to build a new int from a given int, it's similar here. We can build the int with Horners rule.
        long result = 0;
        result = result * 10 + (str.charAt(i) - '0')
        check for overflow with result
    Note: str.charAt(i) - '0' converts a char to an int.
    
23. Implement str Str()
    I learned then when you want to see if something small exists in something big brute force, i.e 
    does aa exist in abcaadw
    It's better to use a for loop and then a while loop instead of two for loops. This helps you continue 
    iterating while the thing you found in the big string equals the little string.
    
24. Reverse Words in a String
    I learned that you can turn a string into a string array based on regex like: String[] arr = s.split(" ")
    StringBuilder also came in handy for building new strings due to how you can easily append to it.
    Lastly, s.trim() is useful to remove starting and trailing whitespaces.
    
25. Longest Common Prefix
    I learned that sometime brute force is just the only way. If you're comparing a prefix of something, you can only 
    run as many times as the smallest input.

26. Delete Node in Linked List
    The general node deletion algorithm without the previous goes
    node.val = node.next.val
    node.next = node.next.next;

27. Remove nth node from end of list
    The algorithm to remove the nth node is a two pointer strategy. The fast running goes n steps through, then once it reaches n steps 
    the slow node and the fast node goes until the fast reaches the end
    
28. Find Duplicate Sub Trees
    I learned its ok to have global variables outside of a recursive call, so you can add and append to them.
    
29. Maximum depth of binary tree
    I learned whenever you have a recursive call + 1 it stacks the addition until you enter the base case, ie
        recursiveCall(root.left) + 1 will return as many times as it's called.
    
30. Validate Binary Search Tree
    I learned sometimes you need help methods in recursion when you need to remember/pass down certain values
    In our case we needed each recursive call to remember a min and max, and that min and max depended on if we were on the
    left or right side
    
31. Binary Tree Level Order Traversal
    I learned that BFS is good for traveling level order (root left right).
    For BFS, we can use a queue. 
    The general algorithm is
        add the root to the queue
        While the queue isnt empty
            loop queue.size amount of times (for each node on the current level)
                add current node to a list or something
                if current node left isnt null
                    add left to queue
                if current node right isnt null
                    add right to queue
             add your res to the ending res
             
32. Merge two sorted lists
    I learned that when iterating through two different LLs that are sorted, we simply compare L1 element vs L2 and if L1 is bigger, add it and 
    update L1, vis versa. At the end, if the lists arent the same size you'll have leftover, you then gotta find out if one is still full and add
    it to the rest.
    
33. Squares of sorted array
    Similar to last, we basically have 2 sorted arrays here (the negative part and the positive part). If we find out where the negative part ends
    and the positive part begins, we can do a two pointer traversal placing the smaller element in the new array
    TLDR 2 sorted arrays = two pointers
    
34. Maximum subarray
    This is Kadane's algorithm: The max sub array is either the current element, or the current element + previous maximum sub array.
    I learned that for memoizing/DP with arrays where you have the max sum/product you can keep another array like dp[i] where it means 
    the MAX sum we can create up to position i, so you will chose between dp[i] or A[i] as your max sum as you iterate
    memo[i] = Math.max(A[i], memo[i-1] + A[i]);
    maxSum = Math.max(memo[i], maxSum);
    
35. Binary Tree pruning
    Think about some recursions with simple cases.
    
36. Copy list with random pointer
    Even if its a linked list question, remember you can store nodes in hashmaps to look them up
    
37. Implement queue with stacks 
    Trick is two use two stacks, a queue functions the same as a backwards stack.