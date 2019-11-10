
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
    Usually whenever you modify an array in place and have to return anindex, you'll use two pointers, I also learned to analyze 
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
    case 2: 1 0 0 9, ending number is 9, make it 0 and add 1 to the previous (implying its also not 9)
    case 3: 9 9 9 9, make new array and set pos 0 to 1.
    It's good to set your if statements up in that order, and to re check and make sure you aren't doing redundent
    logic, in our example we don't even need an if statemment for case 2, we just need to set the pos to 0 if its 9
    and then the rest will be taken care of by case1's if statement.