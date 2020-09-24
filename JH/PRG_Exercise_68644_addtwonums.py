def solution(numbers):
    answer = set()
    for i in range(0, len(numbers)):
        for j in range(0, len(numbers)):
            if i != j:
                answer.add(numbers[i] + numbers[j])
    answer = list(answer)
    answer.sort()
    return answer


if __name__ == "__main__":
    print(solution([2, 1, 3, 4, 1]))
