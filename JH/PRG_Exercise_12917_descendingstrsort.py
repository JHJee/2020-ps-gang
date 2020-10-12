def solution(s):
    s = sorted([i for i in s], reverse=True)
    answer = "".join(s)
    return answer
