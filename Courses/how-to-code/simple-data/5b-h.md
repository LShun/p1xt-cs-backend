# 5b - Helpers

## Function composition

In this lecture, I learned how to nest functions in each other. A function is ideally designed to perform only 1 task. However, when a problem clearly requires one to perform two distinct task on a data, we need to nest them, passing the output of one function to another function.

## Laying out a list of images

In this lecture, I learned how to design a function for a function composition problem. While designing this type of function, I only need to ensure the tests for this function are passing, not the overall problem.

## Operating on list

In this lecture, I learned how to create a helper function that performs insertion sort. This lecture emphasizes on clearing out any ambiguity surrounding the helper functions. For example, we have to state that the list that the insertion sort is going to "insert" is already sorted to begin with. Otherwise, the user will resort the list again and come back to the same function. Besides that, we also have to be clear with the description of the function.

## Domain Knowledge Shift

In this lecture, I learned how to handle "domain knowledge shift" problems while designing a function. This kind of problem happens when you are designing a function to operate on apples, and you are met with a problem on oranges. 

As an example, while we are creating a helper function for 'inserting into a list', we suddenly found out that we also need a function to 'check if this is the right place to insert'. Therefore, we went from 'inserting' to 'checking', and that represents a domain knowledge shift.

Besides that, I also learned how to handle differences in parameter naming. There are two ways to deal with this problem:

1. Name it according to the parameter name throughout the function, slightly ignoring overall consistency in favor of convenience.
2. Change the parameter name to reflect the name used throughout the program, in favor of consistency

## The Last Helper

In this lecture, I learned about how helper rules help to design programs. 

By splitting one gigantic-sized work to several smaller pieces using the:

- "function composition" 
- "knowledge domain shift" 
- "operating on arbitrary sized data"

helper rules, I am able to design several parts of program that contributes to the end result without being boggled down by the details. However, I am still sometimes being bogged down by details, which will (hopefully) improve overtime.

Besides that, I also learned the more macro notation to design more complicated function. I basically created several "macros", similar to the reference rule to split the work of the main function.

## Design Quiz

Oh wow, this took me forever (okay, not really, more like 6 hours). Needless to say I'm still very uncomfortable with the syntax, and how to make use of the design rules.

Most of the time, however, is spent on finding a solution that works. I have immense trouble with the "back-to-front" looping approach with both of the "pyramid" and "falling solids" problem.

However, I did managed to finish it (with a double-face-palm). These are also much easier compared to GCJ problems, I'm looking forward to the next!