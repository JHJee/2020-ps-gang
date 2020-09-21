def solution(s):
    answer = True
    s = [item for item in s]
    p = s.count("P") + s.count("p")
    y = s.count("Y") + s.count("y")
    if p != y:
        answer = False
    return answer
