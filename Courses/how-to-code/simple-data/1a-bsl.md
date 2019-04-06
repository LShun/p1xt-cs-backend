# 1a - Beginning Student Language

- [1a - Beginning Student Language](#1a---beginning-student-language)
  - [Expressions](#expressions)
  - [Evaluation](#evaluation)
  - [Strings and Images](#strings-and-images)
  - [Constant definitions](#constant-definitions)
  - [Function definitions](#function-definitions)
  - [Booleans and if Expressions](#booleans-and-if-expressions)
  - [Using the stepper](#using-the-stepper)
  - [Discovering primitives](#discovering-primitives)
  - [Final comments](#final-comments)

## Expressions

The expressions lecture describes on the basic features of BSL. The main topic of this video is to introduce basic primitives to evaluate expressions. In particular, this video guides us on setting up Dr Racket for BSL. Besides that, this video introduces the 

- "+", 
- "-", 
- "/", 
- "*", 
- sqr (for square)
- sqrt (for square root)

operators. 

## Evaluation

The evaluations lecture introduce on how BSL interprets and evaluates primitive call, or expressions:

1. Reduce operands to values
2. Apply primitive to the value

## Strings and Images

This lecture introduces on how strings and images are used in BSL. 

Strings are used by enclosing them in double-quotes `""`. 

Images require the library `2htdp/image` to work in BSL. After including the library, users can simply copy-paste an image into the source code, something not found in some other languages.

## Constant definitions

This lecture introduces on how we can introduce constant definitions using the keyword `define`. 

Constant definitions are used to store the values of repetitive elements inside a program, and provide an easy way to change its value.

## Function definitions

This lecture introduces the use of functions, its definitions, and rules for evaluating a function call.

Functions are good for dealing with the processing of data in a fixed fashion with a changing data. Functions can be defined using the following format:

```bsl
(define (function-name parameters ...)
    (function-definition))
```

Functions can be called through `(function-name parameters ...)`.

The rules for evaluating function definitions are:

1. record the definition

Rules for evaluating function calls are:

1. Reduce operands to values (called the arguments)
2. Replace function call by:
   1. body of function
3. Replace all parameters by corresponding arguments

## Booleans and if Expressions

This lecture introduces a new data type called `bool`. Besides that, the `if` operator is also introduced.

The `bool` operator is capable of storing 2 values, `true`, and `false`.

The `if` operator is used as a conditional operator, where a code is only ran if and only if the condition is true.

## Using the stepper

This lecture introduces the stepper function in BSL. One surprising aspect of the stepper is that it follows the rules for evaluating code exactly like what's being taught earlier.

## Discovering primitives

This lecture introduces 2 ways to discover primitives, which are the "lucky guess" way and the "search and scroll" way.

The "lucky guess" way refers to highlighting a string in BSL, and search that word on the DrRacket manual.

The "search and scroll" way refers to finding a related function, and using that to search through the documentation.

## Final comments

I actually finished this "what I learned" section after I started part 2. In the beginning, I was actually quite skeptical about this course especially with the name "Simple Data" attached to it. However, after starting with section 1b and 2 , it blown me away. The idea is, "the more you know, the more you don't know". I'm going to start writing my 1b's "what I learned" section later, can't wait to finish off section 2.