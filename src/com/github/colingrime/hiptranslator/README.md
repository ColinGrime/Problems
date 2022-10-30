## Hip Translator
According to the national statistics, a teenager sends/receives 100+ text messages
a day. Dr. Orooji’s teenage children are no exception but the problem is Dr. O
(an old-fashioned, face-to-face communicator) has difficulty reading text messages
full of abbreviations (short-hands) sent to him by his children. Dr. O needs your
help reading these text messages.
Given the list of abbreviations and a paragraph, you are to expand the text
(paragraph) so that Dr. O can read it easily.

[**Input**] The first input line contains an integer, n where (1 ≤ n ≤ 20), indicating 
the number of abbreviations. These abbreviations are on the following n
input lines, one per line. Each input line starts in column 1 and contains an
abbreviation (1-5 characters, consisting of only lowercase letters and/or digits). 
The abbreviation is followed by exactly one space, and this is followed by the ex-
panded version of the abbreviation (1-50 characters, consisting of only lowercase
letters and spaces; assume the expanded version does not start or end with a
space and contains no multiple consecutive spaces between words). Assume that
all abbreviations are distinct, i.e., no duplicates.

The list of abbreviations is followed by a positive integer, p, indicating the
number of input lines containing the paragraph to be expanded. The paragraph
is on the following p input lines. Assume these input lines do not exceed column
50, do not start or end with a space, and each line contains at least one word.
The paragraph will contain only lowercase letters, digits, and spaces. Assume
that there will not be multiple consecutive spaces in the input paragraph.

A word is defined as a consecutive sequence of letters/digits. Assume that a
word will be entirely on one input line, i.e., a word is not broken over two or
more lines.

[**Output**] Each line of the input paragraph must be on one line of output. The
input line must be printed in the output exactly the same (spacing). The only
exception is that each abbreviation must be replaced by its expanded version,
i.e., when an abbreviation is found in the input, its expanded version must be
output.

Note that an abbreviation must match a word completely and not just part of
a word. For example, if u is an abbreviation for you, then u must appear as a
word by itself in the paragraph in order to be replaced, i.e., if the abbreviation
is part of a word in the paragraph (e.g., the paragraph contains the word buy or
ugly or you), the u in these words should not be replaced.

### Sample Input
8  
g2g got to go  
g good  
c see  
l8 late  
l8r later  
d i am done  
u you  
r are  
6  
hi  
how r u  
you tell me  
you are l8  
d  
c u l8r

### Sample Output
hi  
how are you  
you tell me  
you are late  
i am done  
see you later