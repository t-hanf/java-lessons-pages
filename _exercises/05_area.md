---
title: Area
number: 5
lesson: 5
status: reviewed
authors: thanf
---

### Description
```java
public interface Shape {
	public double pi = 3.14159f;
	public double getPerimeter();
	public double getArea();
}
```


### Exercise
1. Implement the interface `Shape` for the classes `Square`, `Circle` and `Rectangle`.
2. The constructor should take the parameters which define the different shapes (e.g. radius, length, ...)
3. Use the constant `pi` if needed
4. Check if your calculations are correct.

### Hints
- to implement an interface for a class use the `implements` keyword