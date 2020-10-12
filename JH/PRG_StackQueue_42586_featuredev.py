from math import ceil


def solution(progresses, speeds):
    answer = []
    days = [ceil((100 - progresses[i]) / speeds[i]) for i in range(len(speeds))]
    count = 1
    curr_max = days[0]
    for i in range(1, len(days)):
        if days[i] > curr_max:
            answer.append(count)
            count = 1
            curr_max = days[i]
        else:
            count += 1
    answer.append(count)
    return answer
