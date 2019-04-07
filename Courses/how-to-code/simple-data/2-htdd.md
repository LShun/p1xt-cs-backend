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