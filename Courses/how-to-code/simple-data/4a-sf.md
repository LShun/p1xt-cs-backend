# 4a - Self-reference

## Introduction to arbitrary sized data

In this lecture, I am faced with a problem that I never faced until now (which is, assuming that I never programmed before starting How to Code: Simple Data), which is the ability to handle an arbitrary sized data. One way to solve it is to use lists, which is left unclarified, and will be clarified in the next lecture.

## List mechanisms

In this lecture, I learned on how to create a list, which is a data structure that stores an arbitrary sized data. 

I am also introduced to two functions, namely `first` and `rest` which allows me to access the first variable in list, and the rest of the list. This is highly similar to a "List" data structure in C where you store the current string, and a pointer to the next part of the list.

Finally, I also learned how to determine if a list is empty through a new function called `empty?` in BSL.

## List Data definition

In this lecture, I learned how to create a data structure containing a list. I actually still used the HtDD recipe, but with a slight tuning. The most significant part is the addition of `empty` and a function, as one of the possible values. Besides that, I also performed a self-reference on the template. Now, this is interesting!

## Function operating on list

In this lecture, I am exposed on how to use functions to operate on a list through an important idea called *recursion* (recursi-ve writing, okay I'm bad at puns). I learned on how to utilize a template that contains a self-reference to write a recursive function. 

This is the hardest concept I have yet to grasp and gave me incredible amount of headache in Google Code Jam questions, and I'm ready for it!

## Revising the Recipes for Lists

In this lecture, I learned how to actually incorporate lists into my data definitions. Besides that, I also learned why does the data structure with self-reference and the function with recursion works (and not just goes on forever). 

The key ingredient of a successful recursion function requires a self-reference case, which allows it to execute an arbitrary amount of times, and also a base case, which stops the recursion.

Besides that, I also learned that it is best to prepare examples in the form of `check-expect` for the base case first, before touching the other self-referential case. This is because the rest of the self-referential case highly relies on the base case.

Finally, I also learned that sometimes it is vital to just trust things will work. In the recursion function, we do not actually know, for exact that the function will work n-th times. However, the template of the function has natural recursion, and it came from a type with a well-formed self-reference, one can count on the natural recursion to work.

Wew, that was a mouthful! I'm looking forward to the next one, seems like more fun is coming my way.