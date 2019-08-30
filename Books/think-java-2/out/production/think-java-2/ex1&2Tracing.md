# C7 - Exercise 1 & 2

## Exercise 1

For each method, write one sentence that describes what the method does, without getting into the details of how it works. And for each variable, identify the role it plays.

```java
public static int banana(int[] a) { // declares a method called banana that accepts an integer array
    int kiwi = 1;                   // sets kiwi to 1
    int i = 0;                      // sets i to 0
    while (i < a.length) {          // while i is less than length of the passed array
        kiwi = kiwi * a[i];         // times kiwi by i
        i++;                        // increase i by 1
    }
    return kiwi;                    // return kiwi
}
```

```java
public static int grapefruit(int[] a, int grape) {  // declares a method called grapefruit
    for (int i = 0; i < a.length; i++) {            // set i to zero, while i is less than the length of the passed array, loop through and increase i by 1
        if (a[i] == grape) {                        // if i is the same as the passed integer
            return i;                               // return i
        }
    }
    return -1;                                      // if grape is bigger than i in the end, return -1
}
```

```java
public static int pineapple(int[] a, int apple) {   // declares a method called pineapple
    int pear = 0;                                   // set pear to 0  
    for (int pine: a) {                             // for every integer intside a
        if (pine == apple) {                        // if that integer is equal to apple
            pear++;                                 // increase pear by 1
        }
    }
    return pear;                                    // return pear
```

}

## Exercise 2

What is the output of the following program? Describe in a few words what mus does. Draw a stack diagram just before mus returns.

```java
public static int[] make(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = i + 1;
    }
    return a;
}
```

```java
public static void dub(int[] jub) {
    for (int i = 0; i < jub.length; i++) {
        jub[i] *= 2;
    }
}
```

```java
public static int mus(int[] zoo) {
    int fus = 0;
    for (int i = 0; i < zoo.length; i++) {
        fus += zoo[i];
    }
    return fus;
}
```

```java
public static void main(String[] args) {
    int[] bob = make(5);
    dub(bob);
    System.out.println(mus(bob));
}
```

In a few words, `mus` sums up the integers stored inside the `zoo` array and returns the sum.

Darn, this is where we need to use something better like draw.io