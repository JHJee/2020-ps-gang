def solution(n):
    last = 0
    curr = 1
    for _ in range(1, n):
        second_last = last
        last = curr
        curr = last + second_last
    return curr % 1234567
