def solution(A, B):
    answer = 0
    A.sort()
    B.sort(reverse=True)
    length = len(A)
    for _ in range(length):
        answer += A[_] * B[_]
    return answer
