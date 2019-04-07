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