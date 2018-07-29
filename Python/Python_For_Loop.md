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
```
int_arr = [1, 2, 3, 4, 5]

for i, int in enumerate(int_arr):
	int_arr[i] += 1
```
