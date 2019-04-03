# Alien Language Solution
# Google Code Jam 2009, Qualification, Question A
# tr@nsistor

from collections import defaultdict

specs = input().split()
ltrs = int(specs[0])
words = int(specs[1])
cases = int(specs[2])

wdict = []
for word in range(words):
    wdict.append(input())
    
for case in range(cases):
    pattern = input()
    parse = [[] for num in range(len(pattern))]
    op = False
    count = 0
    match = 0
    for c in pattern:
        if c is '(':
            op = True
        elif op is True:
            if c is not ')':
                parse[count].append(c)
            else:
                op = False
                count += 1
        else:
            parse[count].append(c)
            count += 1
    parse = [x for x in parse if x]
    for word in wdict:
        for i in range(len(word)):
            if word[i] not in parse[i]:
                break
            if i is (len(word) - 1):
                match += 1
                break
            elif word[i] in parse[i]:
                continue
    print("Case #{}: {}".format(case+1, match))
                
