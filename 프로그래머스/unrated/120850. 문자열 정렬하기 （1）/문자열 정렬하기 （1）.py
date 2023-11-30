def solution(my_string):
    answer = []
    for i in my_string:
        try:
            i = int(i)
            answer.append(i)
        except:
            i = i
            continue
    answer.sort()
    return answer