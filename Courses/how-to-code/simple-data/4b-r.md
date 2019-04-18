# 4a - Reference

## The reference rule, part 1

Usually, I'd be combining multiple parts of a certain topic together, but at this point, I think it might not be as "bite-sized" as previous. Therefore, I'm splitting this up.

From this lecture, I learned how to construct functions with natural references. Put it simply, functions with non-primitive/custom-defined data structures. 

I also learned the importance of setting up helper functions for natural references. I noticed this from the `tuition-graph` example where the data structure is nested in two levels. This makes it unsuitable (or very difficult) to be operated using a single function, especially taking in account of the one-function-per-function rule (what a word).

## The reference rule, part 2

From this lecture, I learned about the importance of actually implementing examples, followed by tests, before actually implementing the actual function. 

Before this, I always attempted forming a general solution to a problem first. Needless to say, that is very time-consuming, error-prone, and very frustrating. This is especially pronounced in Google Code Jam exercises where the problems are non-trivial. I learned that examples actually help us to arrive at the solution by reducing the difficulty of the problem by shrinking the scale of the problem.

By shrinking the scale of the problem, and making multiple examples to handle a different case of the problem, I can find the solution to a general problem by taking `a chunk out one at a time.

## The reference rule, part 3

In this lecture, I learned more about helper functions, and how they relate to functions with reference calls. I learned that if we are doing complicated things (such as processing nested data), we will often encounter the need to call a helper function. 

In fact, in the reference template, when dealing with complicated or heavily-nested data, the template heavily suggests me to make a reference call to an external function. This is very helpful, as debugging becomes easier, and creating the function is faster when a function actually only does a single thing.

Besides that, I also learned more regarding the flow of information through a program. I learned how designing a data can have a very large impact on the design of the overall program.

Finally, I learned that spending time on examples is often not time wasted. This is because a majority of the content are used for inspiration in the actual coding, and a lot of the materials can be reused.

This ends the lectures for 4b, I'm looking forward to 5a after finishing the recommended questions!