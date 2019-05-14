# Chapter 7: Mutual Reference

## Mutually recursive data

From this lecture, I learned how to operate on functions that are mutually recursive, which means that they actually call each other as part of the recursion.

The first key point of this lecture is the introduction of the 'arbitrary arity tree', in which:

- arbitrary: means the size is not known at the start
- arity: means the maximum number of child nodes that any node in a given tree data structure may have. [Source: Wikipedia](https://en.wiktionary.org/wiki/arity)
- Tree: Which is a type of data structure that organizes or arranges data in such a way that they look like branches and leaves visually (or roots, whichever you like more).

The second key point is that although mutual reference cycles are kinda complex (well, to you it might be easy as pie, but it is not for me!), there is a quick way to identify them. 

One of the ways is to draw the arrows from one function call to another, and use a finger to trace the arrows. If a finger ever goes back to the same arrow, then that's a mutual reference cycle.

## Templating Mutual Recursion

Oh boy, here's where the fun starts.

When desining a mutual recursive function, we will often design more than 1 function at once that will form the cycle. 

This means that we will have:

1. Signatures that are directly above one another.
2. Descriptions that are composition of functions.
3. Stubs that are directly above another
4. Examples that are mixed together
5. Functions that are above one another (means no signature or stub blocking the two functions from meeting each other)

This is because when we design one function for a mutual recursion function, we often end up designing all the (sub)functions that form parts of the function itself.

## Functions on mutually recursive data

I actually combined both part 1 and part 2 because they are actually one long video split *for ease of consumption* (I might have to quote this).

In thes lectures, I learned that when designing tests for mutually recursive functions, I will want the base case to be tested first. However, sometimes it is also more natural and acceptable to put a case that's one away from the base case first.

Take note that the base case refers to the case that ends the recursion cycle(s).

## Backtracking search

In this lecture, I learned how to implement backtracking search to find data in an arbitrary arity tree.

Backtracking search refers to a searching method that goes all the way down to one 'leaf' of a 'tree' data structure to find a piece of information, backtracking to another 'branch', and then repeat until it exhausts the entire tree.

Besides that, I also learned how to create function signatures that can return more than one type of data.

Nevertheless, I look forward to the design quiz (although it does makes me shiver a little).