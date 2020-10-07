from itertools import permutations
from math import sqrt


def is_prime_iter(n):
    if n < 2:
        return False
    for i in range(2, n - 1):
        if n % i == 0:
            return False
    return True


def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True


def solution(numbers):
    numbers = [numbers[i] for i in range(len(numbers))]

    if len(numbers) <= 1 and is_prime(int(numbers[0])):
        return len(numbers)

    answer = []
    for i in range(1, len(numbers) + 1):
        pm = permutations(numbers, i)
        for j in pm:
            answer.append("".join(j))
    answer = list(set([int(i) for i in answer]))

    count = 0
    for i in answer:
        if is_prime(i):
            count += 1
    return count
