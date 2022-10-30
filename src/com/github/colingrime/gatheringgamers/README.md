## Gathering Gamers
A line of new students is waiting to get their WrightOne cards. Some of these
students are gamers (as evident by their t-shirts), and they want to meet other
people who share their passion. If a gamer spots another gamer that is within d
spots of them in line, the gamer closer to the beginning of the line will move to
just in front of the other gamer, so they can chat. Your task is to figure out the
number of gamers in the longest contiguous group after these line swaps have
taken place.

[**Input**] The first line of input will be an integer n, 1 ≤ n ≤ 100 that indicates the
number of people in line. The next line of input will be an integer d, 1 ≤ d ≤ 10
that indicates the maximum distance between gamers at which the gamer closest
to the front will swap. The final line of input contains a series of n characters
that are either X (non-gamer) or G (gamer). The first character represents the
person at the front of the line, the second character is the second person in line,
and so on.

[**Output**] A number g that indicates the number of gamers in the largest
contiguous group within the line after all possible swaps have taken place.

### Sample Input
10  
2  
GGXXGGXXXG

### Sample Output
4

[**Explanation**] There are only two people between the second and third gamers
in line, so the second gamer will move in front of the third gamer, and the line
will look like:

GXXGGGXXXG

But now there are only two people between the first gamer and the second one,
so the first gamer will move in front of the second one and the line will look like:

XXGGGGXXXG

The fourth gamer is three away from the fifth one, so no more movement takes
place.
There are four gamers in the largest contiguous group, so the answer is 4.