from re import *


def findBT(pattern, string):
    match_pattern = findall(pattern, string)
    print("Подстроки, удовлетворяющие паттерну: ", match_pattern)


test1 = "Сегодня мы разрабатываем проект, который связан с замечательным файультетом ВТ в университете ИТМО."
test2 = "ВТ это лучший факультет ИТМО, нет ничего лучше ВТ!"
test3 = "Клименков Сергей Викторович один из известнейших преподавателей ВТ ИТМО. Он не только ведет у всего ВТ он известен всему ИТМО."
test4 = "Тут речь идет не только о самом ВТ, а о всем факультете ИТМО - ПИиКТ'е"
test5 = "ВТ и ИТМО - две неразлучные вещи. ВТ является частью ИТМО, часть корабря - часть команды."

pattern = r'\bВТ\b(?:\s+\w+){0,4}\s+\bИТМО\b'

findBT(pattern, test1)
findBT(pattern, test2)
findBT(pattern, test3)
findBT(pattern, test4)
findBT(pattern, test5)