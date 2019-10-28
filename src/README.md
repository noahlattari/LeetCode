
        1. (Two Sum) I learned that containsKey checks if a key is in a hashmap, and that .get gets the value associated with that key.
            You don't always need to have the value as the hashmap value, it can also be the index. The key should be the unique things you 
            are looking for.
          
        2. (Merge Two Binary Trees) I learned that like in AI, you should start by analyzing your cases. In our case we had easy base cases.
            Is t1 null? Just return t2, etc. For this question, think of t1 as the CURRENT left tree node, not THE ENTIRE TREE.
            After our easy cases, we have our harder case (adding them). We can use t1.val += t2.val which implies we return t1.
            We aren't done though, we need to recurs on the left and right side, like iterating through an array, like:
            t1.left = merge(t1.left, t2.left); t1.right = merge(t1.right, t2.right).
       
        3. (Reverse String) I learned that if you have two points going from the start to finish, you may only need to iterate half
            the amount of times as usual, since you are only going until they meet. Also the general swapping algorithm goes:
            char temp = swap1
            swap1 = swap2 - i
            swap2 - i = temp; We have the -i to iterate the pointer.
       
        4. 
            


    