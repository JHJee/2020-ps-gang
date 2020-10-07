from math import sqrt


def is_prime(n):
    for i in range(2, int(sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True


def solution(n):
    count = 0
    for i in range(2, n + 1):
        if is_prime(i):
            count += 1
    return count
