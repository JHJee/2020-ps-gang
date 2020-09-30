def solution(arr, divisor):
    answer = []
    for i in range(len(arr)):
        if not arr[i] % divisor:
            answer.append(arr[i])
    if not answer:
        answer.append(-1)
    return sorted(answer)
