# 8b - Local

## Forming & Intuition

From this lecture, I learned how to form & understand (intuitively) local functions. In DrRacket, local functions has two parts which are the local definitions part (enclosed with a `[]`) and the body, which is the expression part (enclosed with a `()`).

An intuitive way of understanding local function, is that a `local` function sets up a special world with some of its definitions, then evaluates the body expression, and produces the results.

## Lexical Scoping

From this lecture, I learned about lexical scoping and scope contour rules.

Lexical scoping, where lexical means that you can derive the scope from reading the source code [source](https://stackoverflow.com/questions/1047454/what-is-lexical-scope).

Intuitively, lexical scoping is split into two parts, 

1. The creation of scope
2. The searching part

In lexical scoping, whenever the compiler encounter a `local`, it will make a box around it, and sets up the definitions for that particular box. This will repeat for every instance of `local` it encounter.

The second part, is when the compiler sees the reference, it will attempt to find the reference endpoint at the innermost enclosing box. If it can find it, it will use that one and ignore the rest even if multiple copies of the same variable exiss within the program. This will repeat until the global scope, which, if the compiler still can't find it, will throw up an error stating that the compiler can't find the reference.

I also learned a trick in DrRacket to check the reference points in a program using the "Check Syntax" button.

## Evaluation Rules

In this lecture, I learned how to evaluate local functions. 

To evaluate local functions, there are basically 3 steps which are:

1. Rename
   1. In BSL, the definition (say `apple`) is appended with an underscore, followed by a number (say `apple_0`), if it wasn't available (or already defined, the number appended is increased until one available is found).
2. Lift 
   1. The definition is lifted from the local's definition brackets, [], to the top of the program (which now becomes a global definition), below any previous lifted definitions
3. Replace the local with its body
   1. The whole `local` expression is replaced by the body expression.

## Encapsulation

In this lecture, I learned how to encapsulate (or, make into a capsule) a program. An encapsulated program is made by:

1. Finding the functions you wanted to enclose
2. Wrap the functions with local
3. Wrap any local expressions inside a []
4. Add a trampoline to bounce back to the functions you intend to run

Encapsulation is highly useful in production environment, especially when dealing with programs with multiple functions made by different people. This is because the chances of reusing a variable is very likely, and by encapsulating functions, each programmer can freely use expression names without possibly conflicting with others.

## Avoiding recomputation

In this lecture, I learned how to use the local functions and definitions to avoid recomputation. 

TO avoid recomputation, we simply wrap the expression closest to the recomputed expressions, and define the recomputed expression locally. Afterwards, we just replace all the recomputed expressions with the defined local expression.

Usually, recomputation is not a huge problem with the exception of being inside recursive functions. Therefore, sometimes there is no need to sacrifice program maintainability for the sake for negligible performance gain.

I'm looking forward to the design quiz!