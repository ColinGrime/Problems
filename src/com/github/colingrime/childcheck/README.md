## Child Check
Dr. Orooji’s twins (Mack and Zack) play soccer. We will assume Mack wears
jersey number 18 and Zack wears 17. So, Dr. O has to look for these two numbers
when trying to find the twins. Given a list of 10 jersey numbers, determine if 
the twins are in the group of players on the field.

[**Input**] The first input line contains a positive integer, n, indicating the number
of data sets to check. The sets are on the following n input lines, one set per
line. Each set consists of exactly 10 single-space-separated distinct integers (each
integer between 11 and 99 inclusive) giving the jersey numbers for the players.

[**Output**] Print each input set. Then, on the next output line, print one of four
messages: mack, zack, both, or none to indicate how many of the twins are in
the set. Leave a blank line after the output for each test case.

### Sample Input
4  
11 99 88 17 19 20 12 13 33 44  
11 12 13 14 15 16 66 88 19 20  
20 18 55 66 77 88 17 33 44 11  
12 23 34 45 56 67 78 89 91 18

### Sample Output
11 99 88 17 19 20 12 13 33 44  
zack

11 12 13 14 15 16 66 88 19 20  
none

20 18 55 66 77 88 17 33 44 11  
both

12 23 34 45 56 67 78 89 91 18  
mack