# TJ2: C9 - Immutable Objects

## 9.9 Exercises

### Exercise 1

| Using `+` operator | **boolean**   | **char**      | **int**       | **double**    | **String**    |
| ------------------ | ------------- | ------------- | ------------- | ------------- | ------------- |
| **boolean**        | Invalid       | Invalid       | Invalid       | Invalid       | Concatenation |
| **char**           | Invalid       | Addition      | Addition      | Addition      | Concatenation |
| **int**            | Invalid       | Addition      | Addition      | Addition      | Concatenation |
| **double**         | Invalid       | Addition      | Addition      | Addition      | Concatenation |
| **String**         | Concatenation | Concatenation | Concatenation | Concatenation | Concatenation |

Q3

1. *Think about some of the choices the designers of Java made, based on this table. How many of the entries seem unavoidable, as if there was no other choice? How many seem like arbitrary choices from several equally reasonable possibilities? Which entries seem most problematic?*

   > All the entries which involve String seems unavoidable. There isn't a proper way to "add" with other values, as String stores multiple values.
   > The boolean ones seems like arbitrary choices from several equally reasonable possibilities. This is because the values can either be evaluated as boolean first before combining, or just assume that they cannot be concatenated. But Java developers just went with the second one. The most problematic entries seems to be adding double and char together. The Java developers will need to decide on whether to round down or round up double values, and this decision can significantly impact a lot of programs.

2. Here’s a puzzler: normally, the statement `x++` is exactly equivalent to x = x + 1. But if x is a char, it’s not exactly the same! In that case, `x++` is legal, but `x = x + 1` causes an error. Try it out and see what the error message is, then see if you can figure out what is going on.

   > The reason is because `x++` is an increment operator, and when used with `char` also includes a cast. Therefore, it is equivalent with `x = (char)(x+1)`. The `x = x + 1` does not cast it implicitly, and hence is not 'allowed' in a sense.

3. What happens when you add "" (the empty string) to the other types, for example, "" + 5?

   > The data type is converted into a string implicitly and concatenated, the result is a String.

