## Evaluate Boolean

Using the following variables, evaluate the logic expressions in the table below. Write your answers as true, false, or error.

```java
boolean yes = true;
boolean no = false;
int loVal = -999;
int hiVal = 999;
double grade = 87.5;
double amount = 50.0;
String hello = "world";
```

Note: ``OR`` is replaced by `OR` due to Markdown issues with putting `|` symbols inside tables that are formatted with `|` symbols. 

| Expression                         | Simplification = Result                                    |
|------------------------------------|------------------------------------------------------------|
| yes == no `OR` grade > amount      | false `OR` true = true                                       |
| amount == 40.0 `OR` 50.0             | false `OR` true = true                                       |
| hiVal != loVal `OR` loVal < 0        | true `OR` true = true                                        |
| True `OR` hello.length() > 0         | Error. True != true                                        |
| hello.isEmpty() && yes             | false && true = false                                      |
| grade <= 100 && !false             | true && true = true                                        |
| !yes `OR` no                         | false && false = false                                     |
| grade > 75 > amount                | Error, cannot have 2 conditional expression in 1 statement |
| amount <= hiVal && amount >= loVal | true && true = true                                        |
| no && !no `OR` yes && !yes           | false `OR` false = false                                     |
