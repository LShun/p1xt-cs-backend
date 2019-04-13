# 3 - How to Design World

## The big-bang Mechanism

In this 4 part lecture, I learned about a new primitive called `big-bang`. Big bang is a polymorphic primitive, that means it can take on any form. I learned how to use `big-bang` to automate the drawing, redrawing, and modification of the world and the world state.

A fun thing that I noticed is that `big-bang` is similar to a `while` loop in C, but this is just the beginning, and I'm excited.

## Domain Analysis

In this part of the lecture, I learned the steps for analyzing a problem. I mean, a better way than what I'm doing now. Its basically drawing the various possible states a program could be in, the relevant constant and changing variables, and also the `big-bang` options that will be used.

Looking at the domain analysis, I think I could apply this to a lot of Google Code Jam Problems. I always have trouble analyzing programs systematically, this is interesting.

## Program through main Function

On this part of the lecture, I had a practice on how to take the elements distilled from the Domain Analysis part to create a skeleton of the program, and implement TODO lists or wishlists.

Personally, I think there's nothing new here, mostly its just a practice of information transfer.

## Working through the wish list

On this part of the lecture, I have the experience of implementing the wishlists I created under the "Program through main function" part and completing the program, piece by piece. 

This is where the part that I start to see how systematic design can really help to solve difficult problems. Previously, I'd try to solve the problems this way too, but without the HtDD & HtDF recipes, its really difficult to keep track of what I'm doing. I learned how systematic design and templates really fit well together.

## Improving a World Program - Add SPEED

This part of the lecture really exposes how systematic design is important when designing a program. I learned how the 'domain analysis' of the program can be also regarded as a model for the actual program. This is because the analysis picture describes the actual program without too much details. 

By carefully crafting the structure program, I am able to easily make modifications by thinking what I need to do on the model level, then quickly run through the program, changing it and making it match with the model.

## Improving a World Program - Add key handler

From this part of the lecture, I learned about large enumerations and the way to test them. The way to test them is also known as a "white-box" testing. This is a type of testing where you already know how the program will behave, and only test on a few edge cases, such as the ones you have set special actions on, and one of the normal cases.

Besides that, I also learned that when dealing with large enumerations, we often set a few special actions on certain cases, and use an `else` or a generic action for the rest of the cases.