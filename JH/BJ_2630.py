import sys

input = sys.stdin.readline
N = int(input())
M = [list(map(int, input().split())) for _ in range(N)]
whites, blues = 0, 0


def div(i, j, N):
    global whites, blues
    tmp = 0
    for i in range(i, i + N):
        for j in range(j, j + N):
            if M[i][j]:
                tmp += 1
    if not tmp:
        whites += 1
    elif tmp == N ** 2:
        blues += 1
    else:
        div(i, j, N // 2)
        div(i + N // 2, j, N // 2)
        div(i, j + N // 2, N // 2)
        div(i + N // 2, j + N // 2, N // 2)
    return


div(0, 0, N)
print(whites)
print(blues)
