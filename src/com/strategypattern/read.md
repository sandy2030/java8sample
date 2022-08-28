In Strategy pattern, we first create an abstraction of algorithm. This is an interface having the abstract
operation. Then we create implementations of this abstraction and these are called strategies.

A client will always call the abstraction, and will pass a context object. This context object will
decide which strategy to use.