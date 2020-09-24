from math import sqrt


def solution(n):
    answer = -1
    if sqrt(n) % 1 == 0:
        answer = (sqrt(n) + 1) ** 2
    return answer
