# 2 - How to Design Data

## HtDF with Non-Primitive Data

In this lecture, I learned how to use non-primitive data with functions by following the HtDD recipe.

There are 2 important things that I found useful, the first is that if you have an if statement that gives either a true or false, the shorter way to write it will just be the if statement itself (without the true and false).

For example:

```python
    if (a == b):
        print(True)
    else:
        print(False)
```

is equal to

```python
    print(a == b)
```

The second thing that I found useful is that a template does not tell you what things you NEED to use when writing a function definition. However, a template tells you what things you CAN use while writing a function definition.

## HtDF X Structure of Data Orthogonality

From this lecture, I learned that most of the recipes introduced in How to Code: Simple Data are largely orthogonal (which also means independent). This means that I could simply learn about the "How to Design Functions" and "How to Design Data" independently, and get the cross-product for very cheaply.

## Interval

From this lecture, I learned more on how to use the HtDD recipe when dealing with Atomic Non-Distinct data (in precise, the interval type). Besides that, 

I also learned that sometimes, its important to figure out more details from the given data and to introduce them as examples. This especially helps when dealing with more complex data. For example, in a row of seat number, although its not stated, one could figure than the 1st and last seat are aisle seats. Besides that, there is sometimes also an atomic "middle seat" dividing the row into left and right.

## Itemization Part 1, 2 3

From these 3 lectures, I learned on how to use the HtDD recipe when dealing with data with multiple subclasses, with at least one being non-distinct data. 

The most important thing that I learned is when creating conditions for multiple subclasses, it is very important to put guards from the second subclass test on. This is to prevent invalid data being passed into the condition test.

However, there are also 3 rules that I learned to simplify conditions. The rules are all centered around guards:

1. If the subclass is the last subclass of the type, then the whole condition can be simplified to the type guard only. The reason behind is that we have specified the possible data in the data definition, therefore, we can expect our conditions to be respected.
2. If all the remaining subclasses are the same type, then we can eliminate all the guards. The same reasoning as point 1 applies.
3. If the subclass is the last one, the entire condition can be simplified into one `else` statement. Same reasoning as point 1 applies

## HtDF with Interval

This lecture introduces on how to design functions using a custom inverval data type. The most important part is on the tests. When dealing with intervals, it is especially vital to test the endpoints and the midpoints. Besides that, it is also recommended to test variables in between them.

## HtDF with Enumerations

From this lecture, I learned that for enumerations, it is usually best to have an equal number of test for the number of enumerations. However, there are also cases where there are more number of tests than the number of enumerations when the functions consume more than just enumerations.

Another important point that I learned is that I should bug-check the template by running it first before commenting out and using it to design functions. The reason behind is most template are used for multiple copies of data. Therefore, errors in the template can be replicated multiple times if not caught early.

## HtDF with Itemization

This lecture introduces on how to design functions for itemization type data. At this point, the idea that the recipes are orthogonal (or independent) to each other pretty much shines. I can clearly see how the processes can be seperated.

Another important point is that to test functions consuming data featuring itemizations, it is vital to have test for every subclasses. However, multiple tests for atomic non-distinct values can be omitted where appropriate. For example, a list of integers.

The last point is to be active on debugging. Producing bugs in code is frequent even for the best programmers. It is easier to find 3 bugs seperately than to find them at once.

## Structure of Information Flows Through

This summary wraps everything up and help me to understand how important it is to understand the information structure, before starting to build a program.

Through this summary, I learned how the information structure and the data structure has a massive influence over the entire program. The information structure gives ideas on how to build a data structure. Once the data structure is set, the template can be built on it. Finally, the tests and the functions will build on the template. This overlay really nails in the concept of "don't start to code immediately" because often, there are faster and better ways to build programs.