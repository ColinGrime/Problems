## Binarize It

Professor Boolando can only think in binary, or more specifically, in powers of 2.
He converts any number you give him to the smallest power of 2 that is equal to
or greater than your number. For example, if you give him 5, he converts it to 8;
if you give him 100, he converts it to 128; if you give him 512, he converts it to 512.

[**Input**] The first input line contains a positive integer, n, indicating the number
of values to binarize. The values are on the following n input lines, one per line.
Each input will contain an integer between 2 and 100,000 (inclusive).

[**Output**] At the beginning of each test case, output “Input value: v” where v
is the input value. Then, on the next output line, print the binarized version.
Leave a blank line after the output for each test case.

### Sample Input
3  
900  
16  
4000

### Sample Output
Input value: 900  
1024

Input value: 16  
16

Input value: 4000  
4096