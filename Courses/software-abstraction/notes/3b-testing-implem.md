# 3b: Testing & Implementation

- Typical flow of tests
  - Write tests
  - Run tests
  - FAIL
  - Implement
  - PASS
- Typically not linear (have loops)

- **Black box testing** refers to testing of functionality
- **White box testing** refers to testing of implementation

## Deriving Test Cases

**Test suit**: Collection of test cases to thoroughly test data abstraction

### General Guidelines

- Create test case for:
  - everything in effects clause
  - each combination of input & output
- Create test for each branch of method (related to **branch coverage**)
- Test edges of ranges, **boundary checking**
- Name test according to method and scenario. (Test\<method name\>\<scenario description\>)
- Must specify input & outcome

## JUnit

- Typical naming convention: `Test<name of class`
- JUnit looks for `@Test` for methods to be called as tests, and `@Before` (JUnit4) or `@BeforeEach` (JUnit5) for 'setup' purposes.
- Put all duplicate setup behavior into `@Before/@BeforeEach`
- `AssertTrue`, `AssertFalse`, `AssertEquals` are common tools to check the state of objects and values.

### Testability

- Sometimes, we need to add extra methods for JUnit to be able to test the effects of certain functions (especially functions returning nothing)

