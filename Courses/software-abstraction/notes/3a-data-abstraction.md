# 3a: Data Abstraction

## What is Abstraction

- Abstraction is the practice of hiding lower-level details behind higher-level ideas.
- **Statement Abstraction**: Abstracts by using statements. 
  - Example: '=' (assignment operator). Handles lower-level 'data movement' details.
- **Functional abstraction:** Abstracts using functions
- **Data abstraction:** Abstract using classes/interfaces/containers.

## Visibility

- In this video, we discuss on public interface vs private implementation.
- Two of the visibility keywords: *public* and *private* are discussed here
- Public fields
  - are visible to all other classes, and accessible by others. 
  - The visible interface of abstraction
  - Tip of the iceberg.
- Private fields 
  - are only visible within the class itself. 
  - The invisible implementation of abstraction
  - Rest of the iceberg
- We often use visible interface to:
  -  abstract away the implementation (It is more...manageable look at the tip of the iceberg than looking at the entire whole monstrosity)
  - allow for underlying changes without affecting the visible interface (changing the "supporting framework" of the iceberg to make it better without changing the "tip of the iceberg" view)

## Specifying a Data Abstraction

### 4 phases

- Specification, Determine:
  - REQUIRES
  - MODIFIES
  - EFFECTS
- Usage scenarios
  - Looking at ways abstraction will be used, motivate new operations to be specified
- Test specification
  - Write test suite for every operation before implementation
- Implementation

### REQUIRES

- Indicate preconditions
- Typically do not include trivial ones (such as non-null), but focus on conditions to correctly run the method (such as divide by zero)
- Optional, sometimes not required

### MODIFIES

- Mutability means we **can set the value** of an object and it will **remain changed**.
- MODIFIES clause indicates a method or any method it calls mutates an object.
- Types
  - Mutate own object: `MODIFIES: this`
  - Mutates other object `MODIFIES: ...` (replace `...` with object being modified)
  - If `A.a()` calls `B.b()` and `B.b()` modifies `this`, then `A.a()` would specify that it modifies `B` (kinda like a superset modification)
  - Nothing modified: skip clause

### EFFECTS

- Indicates the purpose of the method
- Only describe publicly visible effects
- Eg: `EFFECTS: Increase x by 1`



