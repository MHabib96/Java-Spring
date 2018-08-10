# Python for-loop
##### Negative Indexing
+ Enables backwards indexing, int_arr[-1] indexes the value 5
+ Allows a neat way of looping through arrays twice without any additional loops
```
int_arr = [1, 2, 3, 4, 5]

iterator = -5
total = 0

while iterator > len(int_arr):
	total += int_arr[iterator]
	iterator += 1
```
##### Enumerator
+ Python does not support standard for-loops, only for-each.
+ Using enumerate() works as a substitute to introduce a temporary iterator.
+ Iterator starts at 0 by default, enumerate() takes a second argument to define a custom start for the iterator. `enumerate(iterable, start=0)`
```
int_arr = [1, 2, 3, 4, 5]

for i, int in enumerate(int_arr):
	print(int_arr[i])
```
##### range() in for loop
+ Another substitute for the standard for-loops.
+ The range of the loop can be specified in range() as arguments.
+ 'x' will hold the current int, can be used to index through an array.
```
fruit = ["Apple", "Banana", "Strawberry", "Raspberry", "Grapes"]

array_size = len(array)

for x in range(0, array_size):
    print(array[x])
```
