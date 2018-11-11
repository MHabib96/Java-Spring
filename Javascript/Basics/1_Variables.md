# var, let, and const variables
##### Overview
+ declared **let** and **const** variables are limited in scope to the code block. e.g. Variable declared in loops or condition blocks are limited to the loop.
+ **var** declares a variable globally, or locally to an entire function regardless of block scope.
+ Variables defined with **const** behave like **let** variables, except they cannot be reassigned.
##### In Functions
+ **let** and **const** create block scoped variables.
+ **var** creates function-scoped variables.
##### Scope Examples
+ The last print statement runs successfully because *i* is global and exist outside of the loop.
+ If *i* was defined with **let** then the last print statement will error because *i* is not defined and only exists in the loop block scope.
```
for(var i = 0; i < 5; i++) {
    console.log(i);
}
console.log(i);
```
##### Outside of Functions
+ **var** creates a global variable and attaches it to the *window* object in browser.
+ **let** will create a global variable without attaching it to the window object.
